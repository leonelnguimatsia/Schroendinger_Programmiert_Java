/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KundenDatenKonvertiererNIO
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.kundendatein.konvertieren.einfacher;

import de.galileocomputing.schroedinger.java.kapitel11.kundendaten.KundenDatenKonvertierer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class KundenDatenKonvertiererNIO implements KundenDatenKonvertierer {


    @Override
    public void konvertiereKundendaten(File quelle, File ziel) {

        /**
         * - Das Interface KundenDatenKonvertierer basiert noch auf File-Parametern. Die müssen wir erstmal in Path￾Referenzen
         * umwandeln. Kein Problem mit toPath()
         */
        Path quellPfad = quelle.toPath();
        Path zielPfad = ziel.toPath();
        try {

            /**
             * - Dateioperationen wie Löschen und Erstellen von Dateien und Ver￾zeichnissen funktionieren
             * ab sofort über die Helferklasse Files.
             */
            if(Files.exists(zielPfad)) {
                Files.delete(zielPfad);
            }
            Path zielDatei = Files.createFile(zielPfad);

            //- Hier werden alle Zeilen der Quelldatei in eine Liste von Strings eingelesen, über die wir iterieren,
            List<String> zeilen = Files.readAllLines(quellPfad, StandardCharsets.ISO_8859_1);
            for(int i=0; i<zeilen.size(); i++) {
                String eingabeZeile = zeilen.get(i);
                //und für jede Zeile wird geprüft, ob sie nicht leer ist.
                if(!eingabeZeile.isEmpty()) {
                    //Dann wird die zu schreibende Zeile generiert, so wie eben auch.
                    String ausgabe = eingabeZeile.split(":")[1].trim();
                    if(i%5 < 3) {
                        ausgabe = ausgabe + ", ";
                    }
                    if(i>0 && i%5==0) {
                        // Dabei hängen wir in gewissen Abständen einen Zeilenumbruch an die Zeile, den bekommen wir über die
                        //Systemeigenschaft line.separator.
                        Files.write(zielDatei, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                    }
                    //Danach wird in die Zieldatei geschrieben, wieder über die Helferklasse Files
                    Files.write(zielDatei, ausgabe.getBytes(), StandardOpenOption.APPEND);
                }
            }
        }
        catch (IOException e) {
        }
    }

    @Override
    public void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis, File zielVerzeichnis) {

        /**
         * - Mit Files.newDirectoryStream() bekommst du eine Liste aller Dateien und Unterverzeichnisse in einem
         * Verzeichnis. Genauer gesagt, ein Objekt vom Typ DirectoryStream, mit dem du über einzelne Path￾Objekte iterieren kannst.
         * - Dabei kannst du sogar direkt einen regulären Ausdruck mitgeben, ein spezielles Muster also, das beschreibt, welche Dateien
         * und Unterverzeichnisse in dem DirectoryStream enthalten sein sollen.
         */
        try (DirectoryStream<Path> verzeichnisStream = Files.newDirectoryStream(quellVerzeichnis.toPath(), "*.txt")) {
            Files.createDirectories(zielVerzeichnis.toPath());
            for (Path pfad : verzeichnisStream) {

                /**
                 * - Hier wird der Zielpfad aufgebaut. Das Trennzeichen holen wir uns diesmal über die ebenfalls zu NIO2 gehörende
                 *  Datei FileSystems.
                 * -konvertiereKundendaten() erwartet File-Objekte, kein Problem für uns: Wir wandeln die Path-Objekte einfach mit
                 * toFile() entsprechend um.
                 */
                Path zielPfad = Paths.get(zielVerzeichnis.getPath() + FileSystems.getDefault().
                        getSeparator() + pfad.getFileName().toString().replace(".txt", ".csv"));
                this.konvertiereKundendaten(pfad.toFile(), zielPfad.toFile());
            }
        } catch (IOException e) {
        }
    }
}
