/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchulnotenInString
 *
 ********************************************************************************/


package de.galileacomputing.schroedinger.java.kapitel03;

import java.util.Locale;

public class SchulnotenInString {

    public static void main(String[] args) {

        String note = args[0];
        switch (note.toLowerCase()){
            case "sehr gut":
                System.out.println(1); break;
            case "gut":
                System.out.println(2); break;
            case "befriedigend":
                System.out.println(3); break;
            case "ausrreichend":
                System.out.println(4); break;
            case "mangelhaft":
                System.out.println(5); break;
            case "ungenügend":
                System.out.println(6); break;
            default:
                System.out.println("Ungültige Wert!");
        }
    }
}
