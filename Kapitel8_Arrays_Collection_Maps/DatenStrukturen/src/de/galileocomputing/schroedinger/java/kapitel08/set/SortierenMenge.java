/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SortierenMenge
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortierenMenge {

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
         * - C enthält zuerst alle Elemente aus A und B.
         * - HashSets sind unsortiert. Falls du sortierte Daten brauchst, nimm stattdessen einfach ein java.util.TreeSet, denn
         * das implementiert zusätzlich noch das Interface java.util.SortedSet, die Daten sind also sortiert.
         * - retainAll() sorgt dafür, dass in A nur noch die Schnittmenge aus A und B übrig bleibt.
         * - Und alles minus der Schnittmenge sind die Elemente, die nicht in beiden Mengen enthalten sind.
         * Danach enthält C diese Zahlen, sortiert, versteht sich: [1, 5, 6, 8, 12, 14, 16, 18, 22, 24, 26,28, 30, 32, 34, 36, 38, 40].
         */
        Set<Integer> C = new TreeSet<>();
        C.addAll(A);
        C.addAll(B);
        System.out.println("Vor Differenz aus A und B = "+C);

        A.retainAll(B);
        System.out.println("Schnittmenge von A und B = "+A);

        C.removeAll(A);
        System.out.println("Nach Differenz aus A und B = "+C);


    }
}
