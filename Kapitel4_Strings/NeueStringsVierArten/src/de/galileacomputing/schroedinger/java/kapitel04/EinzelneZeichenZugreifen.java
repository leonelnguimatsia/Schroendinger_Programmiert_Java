/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: EinzelneZeichenZugreifen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class EinzelneZeichenZugreifen {

    public static void main(String[] args) {

        /**
         * Man verwendet die Methode charAt(index), wenn man auf ein einzelnes Zeichen
         * in einem String zugreifen möchte
       */

        String name = "Schrödinger";
        System.out.println("Das erste Zeichen des String ist: "+name.charAt(0));
        System.out.println("Das letzte Zeichen des String ist: "+name.charAt(name.length()-1));

    }

}
