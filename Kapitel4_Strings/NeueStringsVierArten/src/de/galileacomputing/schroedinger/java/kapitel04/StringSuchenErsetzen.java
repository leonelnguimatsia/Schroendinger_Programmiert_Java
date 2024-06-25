/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringSuchenErsetzen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringSuchenErsetzen {

    public static void main(String[] args) {

        /**
         * - Mit der Methode IndexOf() bekommst du den Index des ersten Vorkommens des gesuchten Zeichens
         * bzw. des gesuchten Teilstrings.
         * - Über eine weitere Variante von indexOf() kannst du zusätzlich noch den Startindex angeben, ab dem gesucht werden soll.
         */
        System.out.println("Erste Vorkommen eines Zeichens mithilfe der Methode indexOf():");
        System.out.println("Käsekuchen".indexOf('e'));
        System.out.println("Käsekuchen".indexOf("kuchen"));
        System.out.println("Käsekuchen".indexOf('e', 4));
        System.out.println("--------------------------------------------------------");

        /**
         * Wenn du das letzte Vorkommen brauchst, benutzt du die lasIndexOf()-Methode
         */
        System.out.println("Letzte Vorkommen eines Zeichens mithilfe der Methode lastIndexOf():");
        System.out.println("Käsekuchen".lastIndexOf('e'));
        System.out.println("Käsekuchen".lastIndexOf("kuchen"));
        System.out.println("Käsekuchen".lastIndexOf('e', 4));
        System.out.println("--------------------------------------------------------");

        /**
         * Wenn du nur wissen möchtest, ob ein Zeichen oder ein (Teil)String überhaupt vorkommt, kannst du die Methode
         * contains() verwenden. Der String, nach dem gesucht werden soll, ist als Parameter anzugeben.
         */
        System.out.println("Vorkommen eines Zeichens mithilfe der Methode contains():");
        System.out.println("Käsekuchen".contains("kuchen"));
        System.out.println("Käsekuchen".contains("kalorien"));
        System.out.println("--------------------------------------------------------");

        /**
         * Wenn du nicht nur suchen, sondern auch gleich erstezen möchtest, nimmst du die Methode replace(), denn
         * die ersetzt alle Vorkommen eines (Teil)Strings in einem anderen String
         */
        System.out.println("Suchen und Ersetzen eines Zeichens mithilfe der Methode replace():");
        System.out.println("Käsekuchen".replace("Käse","Schokoladen"));
        System.out.println("Fischers Fritz fischt frische Fische".replace("isch","osch"));
    }
}
