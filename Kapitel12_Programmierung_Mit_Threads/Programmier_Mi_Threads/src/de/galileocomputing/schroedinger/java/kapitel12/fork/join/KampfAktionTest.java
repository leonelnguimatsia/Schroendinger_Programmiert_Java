/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KampfAktionTest
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel12.fork.join;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class KampfAktionTest {

    public static void main(String[] args) {

        List<Feind> feinde = new ArrayList<>();

        //4 000 Feinde, das sind ziemlich viele
        for (int i = 1; i <= 4000; i++) {
            feinde.add(new Feind("Feind " + i));
        }

        //Hier steht die Initialisierung der ersten KampfAktion.
        KampfAktion kaempfen = new KampfAktion(feinde);

        //Der ForkJoinPool nimmt dir viel ab, wenn es um Aufgabenverteilung geht. Eine Instanz hiervon brauchen wir also
        ForkJoinPool pool = new ForkJoinPool();

        /**
         * Über die invoke()-Methode geben wir noch schnell an, welche Aktion ausgeführt werden soll.
         * That’s it! Der Rest wird innerhalb von KampfAktion abgehandelt.
         */
        pool.invoke(kaempfen);
    }

}

