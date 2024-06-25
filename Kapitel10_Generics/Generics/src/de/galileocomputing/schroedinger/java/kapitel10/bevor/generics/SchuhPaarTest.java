/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhPaarTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.bevor.generics;

import de.galileocomputing.schroedinger.java.kapitel10.mit.generics.Karton;

public class SchuhPaarTest {

    public static void main(String[] args) {

        /**
         * - Wenn du jetzt ein Objekt vom Typ Karton erstellst, ersetzt du das E einfach durch die Klasse,
         * für die du einen Karton haben möchtest.
         * - Anstatt vorher über instanceofCheck und Casting kannst du jetzt direkt auf SchuhPaar zugreifen, weil
         * - getInhalt() immer ein Objekt von dem Typ zurückgibt, den du bei der Instanziierung von Karton verwendet hast,
         * in diesem Fall SchuhPaar. Der Compiler weiß durch Karton<SchuhPaar> karton also, dass karton immer ein SchuhPaar enthält.
         */
        SchuhPaar schuhPaar = new SchuhPaar(38,"Schwarz",true);
        Karton<SchuhPaar> karton = new Karton<>(schuhPaar);
        System.out.println(karton.getInhalt().getFarbe());
    }
}
