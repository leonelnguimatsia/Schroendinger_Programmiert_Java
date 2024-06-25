/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: LambdaAusdrücke
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaAusdrücke {

    public static void main(String[] args) {

        /**
         * - Lambda-Ausdrücke in Java sind eine kompaktere Schreibweise für anonyme Klassen mit einer Methode
         */
        List<Integer> zahlen = Arrays.asList(4,5,6,7,5,6,4,7);

        /**
         * - Eine anonyme Klasse hat keinen Namen. Die Implementierung geschieht direkt.
         * - compare() ist die einzige Methode des Comparator-Interfaces. Die Betonung liegt auf „einzige“, das ist gleich noch wichtig.
         * - Hier steht die schon bekannte Implementierung eines Comparators, der Zahlen absteigend sortiert.
         * - Aber jetzt kommt’s: Hier beginnt der Lambda-Ausdruck. Er besteht aus: (Parametern, Pfeil, Rückgabewert).
         */

        // 1.Fall: Sehr gut beschrieben
        /*Collections.sort(zahlen,new Comparator<Integer>() {
            @Override
            public int compare(Integer zahl1, Integer zahl2) {
                return zahl2.compareTo(zahl1);
            }
        });*/

        // 2. Fall: Noch sehr verkürzt
        Collections.sort(zahlen,(zahle1, zahle2) -> zahle2.compareTo(zahle1));
        System.out.println(zahlen);

        /**
         * 3. Fall: Alterativ hättest du eben auch schreiben können:
         * - Das Gleiche wie eben, nur dass du den Lambda-Ausdruck einer Variablen zuweist. Hier siehst du also nochmal:
         * Ein Lambda-Ausdruck ist nichts anderes als die Implementierung eines Interfaces mit einer Methode.
         */

        /*
         * List<Integer> zahlen = Arrays.asList(4,5,6,7,5,6,4,7);
         * Comparator<Integer> comparator = (zahl1, zahl2) -> zahl2.compareTo(zahl1);
         * Collections.sort(zahlen, comparator);
         */
    }
}
