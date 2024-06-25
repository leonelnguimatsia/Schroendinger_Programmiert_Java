/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhpaarStreamTest
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SchuhpaarStreamTest {

    public static void main(String[] args) {

        List<SchuhPaar> schuhPaare = Arrays.asList(
                new SchuhPaar("schwarz", 38, true),
                new SchuhPaar("rot", 38, true),
                new SchuhPaar("rot", 39, true),
                new SchuhPaar("schwarz", 38, false),
                new SchuhPaar("weiß", 39, false)
        );

        /**
         * - Direkt auf einer Collection kannst du die Lambda-Ausdrücke nicht anwenden. Du brauchst einen Stream.
         * - Mit filter() und diesem Lambda-Ausdruck hier bleiben genau die Schuhpaare im Stream, die Schuhgrößen 38 und Stöckel haben.
         * - Mit forEach() iterierst du über den Stream und kannst mit einfach Lambda-Ausdrücke an einzelnen Elemente Kommen.
         */
        Stream<SchuhPaar> achtunddreissigerHighHeels = schuhPaare.stream().filter(
                schuhPaar -> schuhPaar.getGroesse() == 38 && schuhPaar.isMitStoeckel()
        );
        achtunddreissigerHighHeels.forEach(highHeel -> System.out.println("Nach dem Filtern hat man: \n"+highHeel+"\n"));
        System.out.println("-----------------------------------------------------------------");

        /**
         * - Verwende die Methode map(), um von ihren Schuhpaaren jeweils gleichfarbige, stöckellose Schuhe in deiner
         * Schuhgröße zu erstellen.
         * - Die Methode map() nimmt ein Objekt und mappt es auf ein anderes Objekt. Hier das ist also der Eingabeparamter(schuhPaar)
         * und das hier ist der Rückgabewert. Wichtig: Setze unbedingt mitStoeckekeln auf false, Schröndinger, sonst reden die Leute.
         */
        System.out.println("Meine Neue SchuhPaar mit Map(): \n");
        Stream<SchuhPaar> schuhPaarSchroedinger = schuhPaare.stream()
                .map(schuhPaar -> new SchuhPaar(schuhPaar.getFarbe(),44,false));
        schuhPaarSchroedinger.forEach(meineNeuSchuhe -> System.out.println(meineNeuSchuhe+"\n"));


    }
}
