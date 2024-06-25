/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StackLIFO
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Stack;

public class StackLIFO {

    public static void main(String[] args) {

        /**
         * - Stack ist kein Interface, sondern eine Klasse!
         * - Mit push() fügst du neue Elemente hinzu.
         * - Mit empty() prüfst du, ob der Stack leer ist.
         * - Und mit pop() entfernst du das nächste Element vom Stack und bekommst es zurück.
         */
        Stack<SchuhPaar> schuhStapel = new Stack<SchuhPaar>();
        schuhStapel.push(new SchuhPaar("schwarz", 39, true));
        schuhStapel.push(new SchuhPaar("schwarz", 39, false));
        schuhStapel.push(new SchuhPaar("schwarz", 39, false));
        schuhStapel.push(new SchuhPaar("schwarz", 39, false));
        while(!schuhStapel.empty()) {
            System.out.println("Uff, jetzt noch die " + schuhStapel.pop()+"\n");
        }
    }
}
