/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Rechneraufgabe1
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

public class RechnerAufgabe1 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------- Ausgabe von Zahl1 --------------------------");

        int zahl = 5;
        System.out.println("Nach 'Postfix-Schreibweise Inkrementierung' Zahl = "+(zahl++)); //Ausgabe: 5
        System.out.println("Nach 'Präfix-Schreibweise Inkrementierung' Zahl = "+(++zahl));  //Ausgabe: 7

        System.out.println();
        System.out.println("---------- Ausgabe von Zahl2 --------------------------");

        int zahl2 = 7;
        System.out.println("Nach 'Präfix-Schreibweise Inkrementierung' Zahl = "+(++zahl2)); //Ausgabe: 8
        System.out.println("Nach 'Postfix-Schreibweise Inkrementierung' Zahl = "+(zahl2++)); //Ausgabe: 8
    }
}
