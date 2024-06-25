/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CharacterStream
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.bufferedstream.dateien.schreiben;

import java.io.*;

public class CharacterStream {

    public static void main(String[] args) {

        /**
         * - Auch Writer sind AutoClosable. Außen der BufferedWriter und innen der FileWriter.
         * - true bedeutet hier wieder, wir hängen an die Datei an
         * - Und im Gegensatz zu Output-Streams können wir jetzt auch direkt Strings schreiben.
         * - Gibt es die Zieldatei noch nicht, wird sie übrigens angelegt
         *
         */
        try(BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bufferedstream\\dateien\\schreiben\\tagebuch.txt"),true))){

            dateiSchreiber.write("Hallo Schrödinger");

            } catch (IOException ex) {

        }
    }
}
