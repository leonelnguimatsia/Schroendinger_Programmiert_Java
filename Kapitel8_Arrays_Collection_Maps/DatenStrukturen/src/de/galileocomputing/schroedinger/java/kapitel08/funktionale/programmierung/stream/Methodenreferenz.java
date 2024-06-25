/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Methodenreferenz
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.funktionale.programmierung.stream;


import java.util.Arrays;
import java.util.List;

/**
 * Methodenreferenzen identifizieren eine Methode, ohne sie dabei aufzurufen
 */
public class Methodenreferenz {

    public static void main(String[] args) {

        /**
         * - So sieht eine Methodenreferenz aus. Wichtig: Die Signatur der Methode muss zu dem passen, was
         * (in diesem Fall von reduce()) erwartet wird. Integer.max() zum Beispiel nimmt zwei Parameter vom Typ Integer entgegen
         * (also genau das, was auch in der Liste enthalten ist) und liefert einen Wert vom gleichen Typ (Integer) zurück.
         * Hätte die Methode nicht genau zwei Parameter vom Typ der Listenelemente oder würde sie nicht einen Rückgabewert vom gleichen
         * Typ liefern, könnte die Methode hier nicht als Methodenreferenz verwendet werden. Der Compiler würde in so einem Fall aber
         * einen Fehler melden
         */
        List<Integer> zahlen = Arrays.asList(2,3,9,4,5);
        Integer groessteZahl = zahlen.stream().reduce(Integer::max).get();
        System.out.println(groessteZahl);
    }
}
