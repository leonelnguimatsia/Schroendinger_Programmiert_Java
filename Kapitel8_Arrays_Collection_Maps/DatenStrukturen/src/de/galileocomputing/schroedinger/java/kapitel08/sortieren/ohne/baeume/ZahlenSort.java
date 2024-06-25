/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZahlenSort
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.sortieren.ohne.baeume;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZahlenSort {

    public static void main(String[] args) {

        List<Integer> zahlenDurcheinander = Arrays.asList(2,4,3,4,5,6,7, 4,3,5,3,4,5);

        /**
         *  Die sort()-Methode mit einem Parameter, die nur eine Liste als Eingabe erwartet,
         *  sortiert alle Elemente in dieser Liste anhand ihrer compareTo()-Methoden.
         */
        Collections.sort(zahlenDurcheinander);
        System.out.println(zahlenDurcheinander);
    }
}
