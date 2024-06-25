/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamAusgabe Datei Einlesen
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.bytestream.dateien.schreiben;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamAusgabe {

    public static void main(String[] args) {

        /**
         * - Auch Output-Streams sind AutoClosable, also gehören die wieder in das try().
         * - java.io. OutputStream ist die abstrakte Basisklasse FileOutputStream eine Unterklasse zum Schreiben von
         * Dateien. Die nimmt als Parameter auch ein File und über den zweiten Parameter kann angegeben werden, ob das,
         * was geschrieben wird, angehangen werden soll oder ob der vorhandene Inhalt überschrieben werden soll.
         * true steht hier für das Anhängen.
         */
        try(OutputStream ausgabe = new FileOutputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\schreiben\\bytestream\\keineBinaerDatei.txt"),true)){

            /**
             * - Die write()-Methode akzeptiert einzelne Bytes (als int) oder ganze Byte-Arrays wie hier
             * im Beispiel.
             * - Passenderweise gibt es für Strings eine Methode, die einen String in ein Byte-Array umwandelt.
             */
            ausgabe.write("Hallo Schrödinger\n".getBytes());

        } catch (IOException e) {

        }
    }
}
