/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Wertebereich
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

public class Wertebereich {

    public static void main(String[] args) {

        /** Aufgabestellung
         * Schreibe ein Programm, das für eine beliebige Nichtkommazahl ausgibt, ob die Zahl im Wertebereich von
         * byte, short, int oder long liegt. Nutzen dazu Methode und Felder der Wrapperklassen
         */

        Long zahl = Long.parseLong(args[0]);
        System.out.println(zahl + " passt in long Wertebereich: " + (zahl >= Long.MIN_VALUE && zahl <= Long.MAX_VALUE));
        System.out.println(zahl + " passt in int Wertebereich: " + (zahl >= Integer.MIN_VALUE && zahl <= Integer.MAX_VALUE));
        System.out.println(zahl + " passt in short Wertebereich: " + (zahl >= Short.MIN_VALUE && zahl <= Short.MAX_VALUE));
        System.out.println(zahl + " passt in byte Wertebereich: " + (zahl >= Byte.MIN_VALUE && zahl <= Byte.MAX_VALUE));
    }
}
