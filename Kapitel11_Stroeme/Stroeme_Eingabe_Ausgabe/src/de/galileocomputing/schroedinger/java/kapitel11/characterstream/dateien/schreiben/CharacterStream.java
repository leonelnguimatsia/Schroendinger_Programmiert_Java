/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CharacterStream
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.characterstream.dateien.schreiben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CharacterStream {

    public static void main(String[] args) {


        /**
         * - FileWriter ist AutoClosable und bekommt als Parameter wieder ein File
         * - true bedeutet hier wieder, wir hängen an die Datei an
         * - Und im Gegensatz zu Output-Streams können wir jetzt auch direkt Strings schreiben
         * -  Gibt es die Zieldatei noch nicht, wird sie übrigens angelegt
         */
        try(FileWriter dateiSchreiber = new FileWriter(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\characterstream\\dateien\\schreiben\\tagebuch.txt"),true)){

            dateiSchreiber.write("Hallo Schrödinger");
        } catch (IOException e) {

        }
    }
}
