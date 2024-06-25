/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamKopieren Datei Kopieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.bufferedstream.dateien.kopieren;

import java.io.*;

public class StreamKopieren {

    public static void main(String[] args) {

        /**
         * - BufferedInputStream und BufferedOutputStream werden über die anderen Streams „gestülpt“
         */
        try(BufferedInputStream eingabe = new BufferedInputStream(new FileInputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bufferedstream\\dateien\\kopieren\\bild.jpg")));
            BufferedOutputStream ausgabe = new BufferedOutputStream(new FileOutputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bufferedstream\\dateien\\kopieren\\bildkopie.jpg")))){

            // Das hier ist der Zwischenspeicher. Ein Array, das 1024 Bytes enthalten kann
            byte[] buffer = new byte[1024];

            /**
             * - Jede Leseoperation schreibt bis zu 1024 Bytes in diesen Zwischenspeicher
             * -  jede Schreiboperation schreibt den kompletten Zwischenspeicher auf einmal weg.
             */
            while(eingabe.read(buffer) != -1){
                ausgabe.write(buffer);
            }

        } catch (IOException e) {

        }
    }
}
