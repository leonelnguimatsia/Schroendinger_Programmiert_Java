/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: TopDetektive
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.set;

import java.util.Set;
import java.util.TreeSet;

public class TopDetektive {

    public static void main(String[] args) {

        /**
         * Die beiden Top-Detektive C. O’Mpiler und J.V. Mac Hine sind in Urlaub.
         * Du musst für sie einspringen und den Fall lösen. Es gibt eine ganze Reihe
         * Verdächtiger, von denen nur zwei ein Alibi haben. Was ist mit dem Rest?
         * Wer hat ein Faible für Goldschmuck? Wer hatte Zugang zum Safe, wer
         * Zugang zum Schlüssel?
         */

        ///Hier die Verdächtigen:
        String herrMueller = "Herr Müller";
        String frauMueller = "Frau Müller";
        String herrMaier = "Herr Maier";
        String frauMaier = "Frau Maier";
        String derGaertner = "Der Gärtner";
        String diePutzfrau = "Die Putzfrau";
        String dieDiebischeElster = "Die diebische Elster";

        Set<String> verdaechtige = new TreeSet<>();
        verdaechtige.add(herrMueller);
        verdaechtige.add(frauMueller);
        verdaechtige.add(herrMaier);
        verdaechtige.add(frauMaier);
        verdaechtige.add(derGaertner);
        verdaechtige.add(diePutzfrau);
        verdaechtige.add(dieDiebischeElster);

        //Hier die Beweisstücke:

        //Beweisstück A: Wer hat Alibi?
        Set<String> hatAlibi = new TreeSet<>();
        hatAlibi.add(frauMueller);
        hatAlibi.add(derGaertner);

        //Beweisstück B: Wer hat Goldschmuck?
        Set<String> liebtGold = new TreeSet<>();
        liebtGold.add(frauMueller);
        liebtGold.add(herrMaier);
        liebtGold.add(derGaertner);
        liebtGold.add(diePutzfrau);
        liebtGold.add(dieDiebischeElster);

        // Beweisstück C: Wer hat Zugang zu Safe?
        Set<String> zugangZumSafe = new TreeSet<>();
        zugangZumSafe.add(herrMueller);
        zugangZumSafe.add(herrMaier);
        zugangZumSafe.add(derGaertner);
        zugangZumSafe.add(diePutzfrau);

        //Beweisstück D: Wer hat Zugang zum Safe mit Schluessel?
        Set<String> zugangZumSafeSchluessel = new TreeSet<>();
        zugangZumSafeSchluessel.add(herrMueller);
        zugangZumSafeSchluessel.add(frauMueller);
        zugangZumSafeSchluessel.add(herrMaier);
        zugangZumSafeSchluessel.add(frauMaier);
        zugangZumSafeSchluessel.add(dieDiebischeElster);

        // Ausgabe der Verdächtigen je nach Gründen
        System.out.println("- Das Sind die Verdaechtiger: \n"+verdaechtige);

        System.out.println();
        verdaechtige.removeAll(hatAlibi);
        System.out.println("- Verdaechtiger nur ohne Alibi: "+verdaechtige);

        System.out.println();
        verdaechtige.retainAll(liebtGold);
        System.out.println("- Verdaechtiger nur mit Goldschmuck: \n"+verdaechtige);

        System.out.println();
        verdaechtige.retainAll(zugangZumSafe);
        System.out.println("- Verdaechtiger nur mit Zugang zum Safe: \n"+verdaechtige);

        System.out.println();
        verdaechtige.retainAll(zugangZumSafeSchluessel);
        System.out.println("- Verdaechtiger nur mit Zugang zum Safe mit Schlussel: \n"+verdaechtige);
    }
}
