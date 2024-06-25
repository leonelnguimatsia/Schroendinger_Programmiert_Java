/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamMapObjekt
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.funktionale.programmierung.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Für jede Zahl die Wurzel berechnen mit map():
 */
public class StreamMapObjekt {

    public static void main(String[] args) {

        /**
         * - map() nimmt eine Funktion entgegen, die genau einen Parameter hat.
         * - und diesen auf einen anderen Wert mappt. Hier im Beispiel wird für jede Zahl im Stream die Wurzel berechnet.
         * - zeilenweise Ausgabe hier: 2.0, 3.0, 4.0, 5.0, 6.0, 7.0
         * - Ach übrigens: Die Werte in der ursprünglichen Liste bleiben unverändert: [4, 9, 16, 25, 36, 49]
         */
        List<Integer> zahlen = Arrays.asList(4,9,16,25,36,49);
        Stream<Double> wurzeln = zahlen.stream().map(zahl -> Math.sqrt(zahl));
        wurzeln.forEach(zahl -> System.out.println(zahl));
        System.out.println(zahlen);
    }
}
