/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CharacterStream
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.characterstream.dateien.einlesen;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {

    public static void main(String[] args) {

        //FileReader ist AutoClosable und bekommt als Parameter wieder ein File
        try(FileReader dateiLeser = new FileReader(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\characterstream\\dateien\\einlesen\\tagebuch.txt"))){

            int eingelesenesByte;

            // read() liefert ein int, das wir dann in ein char umwandeln
            while ((eingelesenesByte = dateiLeser.read()) != -1){
                System.out.print((char)eingelesenesByte);
            }
        } catch (IOException e) {

        }
    }
}
