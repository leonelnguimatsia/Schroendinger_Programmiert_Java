/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZahleSortUmgekehrt
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.sortieren.ohne.baeume;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ZahleSortUmgekehrt implements Comparator<Integer> {

    public static void main(String[] args) {

        List<Integer> zahlenDurcheinander1 = Arrays.asList(2,4,3,4,5,6,7, 4,3,5,3,4,5);
        List<Integer> zahlenDurcheinander2 = Arrays.asList(21,41,30,40,51,16,17,23,14,15,9,11,0);

        /**
         *  Die sort()-Methode mit einem Parameter, die nur eine Liste als Eingabe erwartet,
         *  sortiert umgekehrt alle Elemente in dieser Liste anhand ihrer compareTo()-Methoden.
         */
        Collections.sort(zahlenDurcheinander1, new ZahleSortUmgekehrt());
        Collections.sort(zahlenDurcheinander2, new ZahleSortUmgekehrt());
        System.out.println("ZahleSortUmgekehrt1 = "+zahlenDurcheinander1);
        System.out.println("ZahleSortUmgekehrt2 = "+zahlenDurcheinander2);
    }

    @Override
    public int compare(Integer zahl1, Integer zahl2) {

        return zahl2.compareTo(zahl1);
    }
}
