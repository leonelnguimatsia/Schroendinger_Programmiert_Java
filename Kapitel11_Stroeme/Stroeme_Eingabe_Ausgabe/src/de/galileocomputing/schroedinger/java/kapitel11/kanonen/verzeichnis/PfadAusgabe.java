/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: PfadAusgabe
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.kanonen.verzeichnis;

import java.io.File;
import java.io.IOException;

public class PfadAusgabe {

    public static void main(String[] args) {

        /**
         * - Hier ist es mal ein Pfad zu einem Verzeichnis
         * - isDirectory() liefert true, wenn es sich bei dem referenzierten Ding um ein Verzeichnis handelt.
         */
        File eingabe = new File("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\eingabe");
        System.out.println(eingabe.isDirectory());

        /**
         * - Erst solltest du prüfen, ob eingabe auch wirklich ein Verzeichnis ist
         * - Danach kannst du dir mit listFiles() die Dateien (und Unterverzeichnisse) auflisten lassen
         * - getAbsolutePath() liefert dir den absoluten Pfad zu der Datei bzw. dem Unterverzeichnis, bei der bzw. dem relative
         * Pfadangaben (wie „..\\relativerPfad“) nicht aufgelöst werden.
         * - getCanonicalPath() liefert dir den kanonischen Pfad zu der Datei/dem Unterverzeichnis, das heißt, relative Kompo￾nenten
         * im Pfad werden aufgelöst. Können diese relativen Komponenten nicht aufgelöst werden, gibt es eine Exception.
         * - getName() gibt dir den Namen einer Datei zurück, inklusive Dateiendung.
         * - getPath() liefert dir den Pfad zu der Datei bzw. dem Unterverzeichnis, mit dem das File-Objekt erstellt wurde.
         * - getParent() gibt dir das Elternverzeichnis zurück oder null, wenn es kein Elternverzeichnis im Pfad gibt
         */
        if(eingabe.isDirectory()){
            for(File datei : eingabe.listFiles()){
                System.out.println(datei.getAbsolutePath());
                try{
                    System.out.println(datei.getCanonicalFile());
                } catch (IOException e) {

                }
                System.out.println(datei.getName());
                System.out.println(datei.getPath());
                System.out.println(datei.getParent());
            }
        }


    }
}
