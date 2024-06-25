/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamFilterObjekt
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.funktionale.programmierung.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Mit „S“ beginnende Namen herausfiltern mit filter():
 */
public class StreamFilterObjekt {

    public static void main(String[] args) {

        /**
         * - Jede Collection hat jetzt eine Methode stream(), über die holst du dir eine Instanz von Stream.
         * - Stream hat verschiedene Methoden, unter anderem eben die Methode filter(), mit der du genau die Elemente herausfilterst,
         * für die der Lambda￾Ausdruck ein true liefert. Zurück bekommst du ein Stream-Objekt.
         * - Du könntest den Stream auch mit toArray() in ein Array umwandeln und darüber iterieren. Besser aber du nimmst forEach(). Diese
         * Methode wendet den übergebenen Lambda-Ausdruck auf jedes Element im Stream an.
         */
        List<String> namen = new ArrayList<>();
        namen.add("Schrödinger");
        namen.add("Bissingen");
        namen.add("Bossingen");
        namen.add("Bussingen");
        namen.add("Schickelmickel");
        Stream<String> namenStream = namen.stream();
        Stream<String> namenMitS = namenStream.filter(name -> name.startsWith("S"));
        namenMitS.forEach(name -> System.out.println(name));
    }
}
