/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SetMenge
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.set;

import java.util.HashSet;
import java.util.Set;

public class SetMenge {

    public static void main(String[] args) {

        /**
         * - eine Menge von Zahlen, als Implementierung ein HashSet nichts Besonderes hier, einfach ein paar Zahlen in die Menge reinmengen,
         * -  Ergebnis wie erwartet: [1, 2, 3, 4]
         */
        Set<Integer> zahlen = new HashSet<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        System.out.println(zahlen);
        /**
         * - In Mengen dürfen Elemente nur einmal vorkommen. Das hier hat keinen Effekt, das Ergebnis ändert sich
         * daher nicht: [1, 2, 3, 4]
         */
        zahlen.add(4);
        System.out.println(zahlen);

    }
}
