/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamReduceObjekt
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel08.funktionale.programmierung.stream;


import java.util.Arrays;
import java.util.List;

/**
 * Das Maximum einer Zahlenliste ermittelnmit reduce():
 */
public class StreamReduceObjekt {

    public static void main(String[] args) {

        /**
         * - Rein kommen zwei Werte, raus nur einer, in diesem Fall hier das Maximum der beiden Zahlen
         */
        List<Integer> zahlen = Arrays.asList(2,3,6,4,5);
        Integer groessteZahl = zahlen.stream().reduce((zahl1, zahl2) -> Integer.max(zahl1, zahl2)).get();
        System.out.println(groessteZahl);


        /**
         * - Apropos, das Maximum von Zahlen kannst du auch noch anders ermitteln:
         * - Die Klasse Arrays hat auch eine neue Methode stream(). Die macht aus einem Array einen Stream.
         * Übergibst du wie hier ein Array mit Integer-Werten, ist das übrigens ein Stream vom Typ java.util.stream. IntStream
         * und der hat eine Methode max(). Mit der kommst du auch zum Ziel.
         */

        /*int[] zahlenArray = {2,3,6,4,5};
        Integer groessteZahl = Arrays.stream(zahlenArray).max();
        System.out.println(groessteZahl);*/
    }
}
