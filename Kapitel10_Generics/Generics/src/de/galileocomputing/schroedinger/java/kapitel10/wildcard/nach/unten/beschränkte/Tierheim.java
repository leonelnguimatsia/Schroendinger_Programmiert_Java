/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Tierheim
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel10.wildcard.nach.unten.beschränkte;

import java.util.ArrayList;
import java.util.List;

public class Tierheim {

    public static void main(String[] args) {

        List<Tier> katzen = new ArrayList<>();
        System.out.println(" Die Liste von Katze: ");
        vermehrtEuch(katzen);

        // Ausgabe der Katzen aus der Liste
        for (Tier tier : katzen) {
            if (tier instanceof Katze) {
                System.out.println("- "+ tier.getName());
            }
        }

        System.out.println();
        List<Tier> hunden = new ArrayList<>();
        System.out.println(" Die Liste von Hunde: ");
        vermehrtEuch(hunden);

        // Ausgabe der hunden aus der Liste
        for (Tier tier : hunden) {
            if (tier instanceof Hund) {
                System.out.println("- "+tier.getName());
            }
        }
    }

    /**
     * - Erst kommt der Wildcard-Operator, gefolgt von super und schließlich die untere Grenze
     * @param tiere
     */
    public static void vermehrtEuch(List<? super Tier> tiere){

        tiere.add(new Katze("Schnuckel"));
        tiere.add(new Katze("Lisa"));

        tiere.add(new Hund("Max"));
        tiere.add(new Hund("Medor"));
        tiere.add(new Hund("Marc"));

    }

}
