/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CharacterCaeser
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

public class CharacterCaeser {

    /** Aufgabestellung:
     * Schreibe ein Programm, das für einen beliebigen Buchstaben des Alphabets
     * denjenigen Buchstaben ermittelt, der sechs Stellen weiter im Alphabet steht.
     * Falls du dabei über die 26 "hinrausrutschst", zähle einfach beim "A" weiter. für "V"
     * sollte das programm zum Beispiel ein "B" ausgeben.
     *
     * @param args
     */
    public static void main(String[] args) {

        char buchstabe = 'V';     //Buchstabe der umgewandelt werden soll
        int rotation = 6;         // Anzahl der Positionen, um die der Buchstabe "verschoben" werden soll
        int alphabetStart = 'A';  // Anfang-Buchstabe in dem Alphabet "von A bis Z" also "von 0 bis 26".
        buchstabe -= alphabetStart; // Ermittlung der Position des Eingabebuchstabens
        buchstabe += rotation;      // Addieren wir die Position der Buchstabe, der um 6-Stellen verschoben werden soll
        buchstabe %= 26;            // Mit Modulo "%" wird die jetzige position der Buchstabe ermittelt
        buchstabe += alphabetStart;   // Addieren wir noch mit dem eingangs abgezogene alphabeStart wieder.
        System.out.println();
        System.out.println("Für sechs verschobene Stelle ergibt sich jetzt" +
                " die Buchstabe: "+ buchstabe);
    }
}
