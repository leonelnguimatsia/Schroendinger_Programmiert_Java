/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Wochentagen
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.wochentagen;

public class Wochentagen {

    public static void main(String[] args) {

        String [] wochentagen = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag","Samstag","Sonntag"};

        for (int i = 0; i < wochentagen.length; i++) {
            System.out.println((i+1)+". "+wochentagen[i]);
        }
    }
}
