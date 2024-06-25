/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Tierheim
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel10.wildcard.nach.oben.beschränkte;

import java.util.ArrayList;
import java.util.List;

public class Tierheim {

    public static void main(String[] args) {

        List<Katze> katzen = new ArrayList<Katze>();

        katzen.add(new Katze("Schnuckel"));
        katzen.add(new Katze("Lisa"));
        System.out.println(" Die Liste von Katze: ");
        druckName(katzen);

        System.out.println();
        List<Hund>hunden = new ArrayList<Hund>();
        hunden.add(new Hund("Max"));
        hunden.add(new Hund("Medor"));
        hunden.add(new Hund("Marc"));
        System.out.println(" Die Liste von Hunde: ");
        druckName(hunden);
    }

    /**
     * - Erst kommt der Wildcard-Operator, gefolgt von extends und schließlich die obere Grenze
     * @param tiere
     */
    public static void druckName(List<? extends Tier> tiere){

        for (Tier tier : tiere){
            System.out.println("- "+tier.getName());
        }

    }
}
