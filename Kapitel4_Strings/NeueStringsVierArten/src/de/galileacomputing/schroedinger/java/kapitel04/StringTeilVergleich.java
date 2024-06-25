/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringTeilVergleich
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringTeilVergleich {

    public static void main(String[] args) {

        /**
         * - "endsWith()", um zu prüfen, ob ein String mit einem anderen String endet.
         * - "startWith()" um zu prüfen, ob ein String mit einem anderen String beginnt.
         * - "regionMatches()" um zu prüfen, ob ein bestimmter Teil eines Strings einem anderen String gleicht.
         * Die Methode "regioMatches(2,"Badewanne",5,4)" hat vier Parameter:
         * 1. Parameter gibt an, ab welchem Index (von "Pfannekuchen") du den Vergleich durchführen möchtest. Ab 2, also ab dem "a".
         * 2. Parameter ist der String, aus dem ein Teilstring verglichen werden soll.
         * 3. Parameter ist der Index des Teilstrings, der verglichen werden soll (Also ab dem zweiten 'a# in "Badewanne").
         * 4. Parameter gibt hier an, wie viel Zeichen verglichen werden sollen.
         */

        System.out.println("Urinstinkt".endsWith("instinkt"));
        System.out.println("Tischlerei".startsWith("Tischler"));
        System.out.println("Pfannekuchen".regionMatches(2,"Badewanne",5,4));

    }
}
