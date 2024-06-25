/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Charakter_Ueberpruefen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

public class Charakter_Ueberpruefen {

    public static void main(String[] args) {

        /** Aufgabestellung:
         * Schreibe ein Programm. das für ein Char ausgibt, ob es ein Buchstabe ist
         * und ob es ein Groß- oder Kleinbuchstabe ist.
         */

        char letter = 'b';

        if(Character.isLetter(letter) && Character.isLowerCase(letter)){

            System.out.println(letter+" ist ein Buchstabe und sogar eine Kleinbuchstabe ");
        } else{
            System.out.println(letter+" ist ein Buchstabe und sogar eine Großbuchstabe ");
        }
    }
}
