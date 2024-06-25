/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: LesenSchreibenOhneStream
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.file.io.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class LesenSchreibenOhneStream {

    public static void main(String[] args) {
        /**
         * - Über die Helferklasse java.nio.file.Paths erstellst du Instanzen von Path, das ab sofort statt der Klasse
         * File Dateien und Verzeichnisse repräsentiert.
         * - Die Helferklasse Files enthält jede Menge statischer Methoden zum Arbeiten mit Dateien und Verzeichnissen:
         * * zum Beispiel kannst du damit einzelne Verzeichnisse erstellen
         * * oder auch über createDirectories() direkt alle Verzeichnisse, die in einem Pfad liegen (ähnlich wie schon mit
         * mkdirs())
         * - Path steht wie zuvor File sowohl für Dateien als auch für Verzeichnisse. Das Erstellen von beidem wird aber trotzdem weiterhin
         * über verschiedene Methoden gehandhabt.
         */
        Path datei = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bossingen\\ausgabe\\datei.txt");
        Path andereDatei = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bossingen\\ausgabe\\andereDatei.txt");
        try{
            /*Path datei = Files.createFile(ausgabe.resolve("datei.txt"));
            Path andereDatei = ausgabe.resolve("andereDatei.txt");
            System.out.println(datei.toAbsolutePath());*/

            /**
             * - Hierüber bekommst du aus einer Datei direkt alle Zeilen als Liste von Strings. Bequem, oder?
             * Außerdem kannst du direkt das Encoding bestimmen, das verwendet werden soll.
             */
            List<String> zeilen = Files.readAllLines(datei, StandardCharsets.ISO_8859_1);

            /**
             * - Schreiben ist genauso einfach: Entweder du schreibst direkt eine Liste von Strings (genauer gesagt, etwas, das
             * Iterable<? extends CharSequence> ist) hinein.
             * - oder einzelne Byte-Arrays,
             * - oder du kopierst direkt die komplette Datei. Adios, FileInputStream, adios FileOutputStream!
             */
            //Files.write(andereDatei, zeilen, StandardCharsets.ISO_8859_1);

            /*for (String zeile :zeilen){
                //Hier wird nach jeder zeile ein Zeilenumbruch (System.lineSeparator()) hinzugefügt, bevor es in die Datei geschrieben wird.
                Files.write(andereDatei, (zeile + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println(zeile);
            }*/
            Files.copy(datei,andereDatei, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {

        }
    }
}
