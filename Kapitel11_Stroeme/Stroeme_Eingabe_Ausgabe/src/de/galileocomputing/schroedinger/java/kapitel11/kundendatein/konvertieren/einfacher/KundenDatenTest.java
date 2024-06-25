/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KundenDatenTest
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.kundendatein.konvertieren.einfacher;

import de.galileocomputing.schroedinger.java.kapitel11.kundendaten.KundenDatenKonvertierer;

import java.io.File;

public class KundenDatenTest {

    public static void main(String[] args) {

        KundenDatenKonvertierer konvertierer = new KundenDatenKonvertiererNIO();

        konvertierer.konvertiereKundendaten(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\eingabe\\kundendaten.txt"),
                new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\ausgabe\\kundendaten.csv")
        );

        /**
         * - Das Quellverzeichnis voll mit Textdateien
         * - Und das Zielverzeichnis. Hier sollen die CSV-Dateien hinkopiert werden
         */
        konvertierer.konvertiereKundendatenInVerzeichnis(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\eingabe"),
                new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bossingen\\ausgabe"));
    }
}
