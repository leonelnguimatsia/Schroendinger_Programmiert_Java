/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: AnzahlTageInMonat
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnzahlTageInMonat {

    public static void main(String[] args) {

        /**
         * - Ähnlich wie schon bei Sets und Listen können wir bei der Deklaration die Typen angeben, die vorkommen
         * dürfen. Diesmal für die Werte und für die Schlüssel.
         */
        Map<String, Integer> anzahlTageInMonaten = new HashMap<String, Integer>();

        /**
         * - Maps haben statt einer add()-Methode eine put()-Methode, der du den Schlüssel und den Wert übergibst.
         * - Werte können in Maps mehrmals vorkommen, Schlüssel nur einmal.
         */
        anzahlTageInMonaten.put("Januar", 31);
        anzahlTageInMonaten.put("Februar", 28);
        anzahlTageInMonaten.put("März", 31);
        anzahlTageInMonaten.put("April", 30);

        //Mit get() kannst du dir zu einem Schlüssel den Wert liefern lassen.
        System.out.println("Anzahl von Tage von Februar = "+anzahlTageInMonaten.get("Februar"));

        /**
         * - Falls du mal nicht weißt, welche Schlüssel in einer Map gespeichert sind: keySet() liefert dir ein
         * Set aller vorhandenen Schlüssel. values() liefert alle Werte.
         */
        Set<String> alleSchluessel = anzahlTageInMonaten.keySet();
        System.out.println("Die monatliche Schlüssen sind = "+alleSchluessel);

        /**
         * - Über remove() löschst du Einträge in der Map.
         * - Als Rückgabewert bekommst du den Wert, der mit dem Schlüssel assoziiert war, oder null, wenn kein Wert vorhanden war.
         */
        Integer tage = anzahlTageInMonaten.remove("Februar");
        System.out.println("Gelöschte Tage des Monat von Februar = "+tage);

        Collection<Integer> werte = anzahlTageInMonaten.values();
        System.out.println("Anzahl der Tage vom jeweiligen Monat = "+werte);

        //Ausgabe den Monat und die Tage in der Map
        System.out.println("--------------------------------------");
        for (String schluessel : alleSchluessel) {
            System.out.println("Der " + schluessel + " hat "
                    + anzahlTageInMonaten.get(schluessel) + " Tage.");
        }
    }
}
