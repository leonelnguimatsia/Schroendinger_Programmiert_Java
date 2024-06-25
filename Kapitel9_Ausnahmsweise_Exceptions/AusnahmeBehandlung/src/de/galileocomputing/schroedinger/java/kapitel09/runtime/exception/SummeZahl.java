/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SummeZahl
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.runtime.exception;

public class SummeZahl {

    public static void main(String[] args) {

        // Prüfe die Voraussetzungen, die du brauchst!
        if (args.length >= 2) {

            //Erst dann greifst du auf den Inhalt des Arrays zu. Dann kann dabei auch keine ArrayIndexOutOfBoundsException
            // mehr auftreten.
            Integer zahl1 = Integer.parseInt(args[0]);
            Integer zahl2 = Integer.parseInt(args[1]);
            System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
        }else{
            System.err.println("Ohne gute Argumente kommst du bei mir nicht weiter.");
        }
    }

}
