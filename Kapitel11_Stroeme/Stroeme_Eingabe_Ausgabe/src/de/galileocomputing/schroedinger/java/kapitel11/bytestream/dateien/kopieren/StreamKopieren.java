/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamKopieren Datei Kopieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.bytestream.dateien.kopieren;

import java.io.*;

public class StreamKopieren {

    public static void main(String[] args) {

        /**
         * - Der Input-Stream liest die Bilddatei Byte für Byte ein, während der Output-Stream
         * die einzelnen Bytes nach und nach in die Zieldatei schreibt
         */
        try(InputStream eingabe = new FileInputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bytestream\\dateien\\kopieren\\bild.jpg"));
            OutputStream ausgabe = new FileOutputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bytestream\\dateien\\kopieren\\bildKopie.jpg"))){

            int  eingelesenesByte;
            while((eingelesenesByte = eingabe.read()) != -1){

                ausgabe.write(eingelesenesByte);
            }
        } catch (IOException e) {

        }
    }
}
