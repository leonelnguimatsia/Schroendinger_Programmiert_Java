/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: QueueFIFO
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFIFO {

    public static void main(String[] args) {

        /**
         * - LinkedList implementiert das Interface Queue. Neue Elemente werden mit offer() hinzugefügt.
         * - Mit peek() schauen wir, ob noch Elemente in der Queue sind. und holen die mit poll() raus.
         */
        Queue<String> warteSchlange = new LinkedList<>();
        warteSchlange.offer(new String("Herr Schrödinger"));
        warteSchlange.offer(new String("Frau Fransen"));
        warteSchlange.offer(new String("Herr Müller"));
        while(warteSchlange.peek() != null) {
            System.out.println("Der Nächste bitte! Ah, guten Tag "
                    + warteSchlange.poll() + "!");
        }
    }
}
