/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CharacterStream
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.bufferedstream.dateien.einlesen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {

    public static void main(String[] args) {

        /**
         * - Auch Writer sind AutoClosable. Außen der BufferedReader und innen der FileReader.
         * - Der BufferedReader stellt dir die Methode readLine() zur Verfügung, die dir direkt eine komplette Zeile einer
         * Textdatei als String zurückgibt.
         */
        try(BufferedReader dateiLeser = new BufferedReader(new FileReader(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bufferedstream\\dateien\\einlesen\\tagebuch.txt")))){

            String zeile;
            while((zeile = dateiLeser.readLine()) != null){
                System.out.println(zeile);
            }
        } catch (IOException e) {

        }
    }
}
