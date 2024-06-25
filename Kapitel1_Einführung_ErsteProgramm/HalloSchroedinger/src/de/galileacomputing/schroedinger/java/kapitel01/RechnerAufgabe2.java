/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Rechneraufgabe2
 *
 ********************************************************************************/


package de.galileacomputing.schroedinger.java.kapitel01;

public class RechnerAufgabe2 {

    public static void main(String[] args) {

        int zahl = 7;
        System.out.println();
        System.out.println("---------- Ausgabe von Zahl --------------------------");
        System.out.print((++zahl)+", ");          //3. "Nach 'Präfix-Schreibweise Inkrementieren' Zahl = 8"
        System.out.print((zahl++)+", ");          //2. "Nach 'Postfix-Schreibweise Inkrementieren'Zahl = 8"
        System.out.print((zahl*zahl)+", ");       //4. "Nach 'Multiplikation' Zahl = 81"
        System.out.print((zahl=zahl*zahl)+", ");  //1. "Keine Änderung nur Ausgabe. Das heißt(zahl = zahl*zahl)' Zahl = 81"
        System.out.print((zahl=(zahl-9)/8)+", "); //7. "Nach Ausführung der Operation: (zahl=(zahl-9)/8) ' Zahl = 9"
        System.out.print((zahl--)+", ");          //6. "Nach 'Präfix-Schreibweise Dekrementieren' Zahl = 9"
        System.out.print((--zahl)+", ");          //5. "Nach 'Präfix-Schreibweise Dekrementieren' Zahl = 7"
        System.out.print((zahl));                 //8. "Keine Änderung nur Ausgabe' Zahl = 7"

    }
}
