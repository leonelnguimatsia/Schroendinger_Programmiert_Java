/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: UnsortierenMenge
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.set;

import java.util.HashSet;
import java.util.Set;

public class UnsortierenMenge {

    public static void main(String[] args) {

        /**
         * - Echte Mathematiker kennen keine Java-Code￾Conventions. Lower Camel Case? Nie gehört.
         * - A enthält alle geraden Zahlen zwischen 1 und 40.
         */
        Set<Integer> A = new HashSet<>();
        for(int i=2; i<=40; i+=2) {
            A.add(i);
        }

        /**
         * - B enthält alle Teiler von 20. Wie du ermittelst, ob eine Zahl Teiler einer anderen ist, weißt du schon seit
         * unseren Primzahlabenteuern: mit dem Modulo-Operator.
         */
        Set<Integer> B = new HashSet<>();
        for(int i=1; i<=20; i++) {
            if(20%i==0) {
                B.add(i);
            }
        }

        /**
         * - Ausgabe bei A hier: [34, 32, 2, 38, 4, 36, 6, 8, 40, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]. Unsortiert? Wieso das?
         * - HashSets sind unsortiert. Falls du sortierte Daten brauchst, nimm stattdessen einfach ein java.util.TreeSet, denn
         * das implementiert zusätzlich noch das Interface java.util.SortedSet, die Daten sind also sortiert
         * -  Ausgabe bei B hier: [1, 2, 4, 20, 5, 10].
         * - Die Schnittmengen-Operation in Aktion: Mit retainAll() bleiben in A nur die Elemente übrig, die auch in B vorkommen, und
         * das sind genau 2, 4, 10 und 20. Du hättest genauso gut auch B.retainAll(A) aufrufen können, das Ergebnis wäre das gleiche.
         */
        System.out.println(A);
        System.out.println(B);
        A.retainAll(B);
        System.out.println(A);
    }
}
