/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuheTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.*;

public class SchuhPaarTest {

    public static void main(String[] args) {

        //Instanz von Schuhe nur mit Array
        //SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitArray();

        /**
         * - Instanz von Schuhe nur mit ArrayList
         * - ArrayList benutzt den schreibenden Zugriff, um an die Elemente der List zuzugreifen: Einfach
         * die Schuhe an die letzte Position im Schuhregal und fertig
         */
        //SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new ArrayList<SchuhPaar>());

        /**
         * - Instanz von Schuhe nur mit HashSet
         * - HashSet benutzt den lesenden Zugriff, um an die Elemente der List zuzugreifen: Bei den HashSets musst
         * du erstmal den richtigen Schuhschrank finden, das kostet je nach Anzahl der Schuh￾schränke Zeit
         * - Allerdings findest du die Schuhe in HashSets schneller, weil dort nicht wie bei einer ArrayList alle Elemente
         * durchgegangen werden müssen, sprich, der lesende Zugriff ist bei Hashcode-basierten Datenstrukturen schneller.
         */
        //SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new HashSet<SchuhPaar>());

        SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new TreeSet<SchuhPaar>());

        SchuhPaar schuhPaar = new SchuhPaar("schwarz", 39, true);
        SchuhPaar schuhPaar2 = new SchuhPaar("lila", 39, false);
        SchuhPaar schuhPaar3 = new SchuhPaar("gelb", 39, true);
        SchuhPaar schuhPaar4 = new SchuhPaar("blau", 39, false);
        tester.addSchuhPaar(schuhPaar);
        tester.addSchuhPaar(schuhPaar2);
        tester.addSchuhPaar(schuhPaar3);
        tester.addSchuhPaar(schuhPaar4);

        //Ein exakt gleichesSchuhpaar
        //SchuhPaar gleichesSchuhPaar = schuhPaar;
        //SchuhPaar gleicheSchuhe = new SchuhPaar("schwarz", 39, true);
        //tester.addSchuhPaar(gleicheSchuhe);
        //StringBuilder meldung = new StringBuilder();

        // liefert, wie nicht anders zu erwarten, true.
        /*meldung.append(tester.hastDuSchon(gleichesSchuhPaar) ? gleichesSchuhPaar +
                " hast du schon\n\n" : gleichesSchuhPaar + " hast du noch nicht\n\n");*/

        // Objektinstanmit Map
        SovieleSchuheHastDuSchonTester testerMitAnzahl = new SchuhTesterMitMap(new ArrayList<SchuhPaar>(), new HashMap<SchuhPaar, Integer>());
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz",39 , true));

        SchuhPaar gleichesSchuhPaar = schuhPaar;
        StringBuilder meldung = new StringBuilder();
        meldung.append(testerMitAnzahl.hastDuSchon(gleichesSchuhPaar)
                ? gleichesSchuhPaar + " hast du schon"
                : gleichesSchuhPaar + " hast du noch nicht");
        meldung.append(", und zwar schon " + testerMitAnzahl.sovieleHastDuSchon
                (gleichesSchuhPaar) + " Stück");
        System.out.println(meldung.toString());

        System.out.println();
        System.out.println("Anzahl von Schuhe in der Collection: "+tester.getSchuhKollektion().size());
        System.out.println();

        //ObjektInstanz mit Map zur Prüfung der maximal Anzahl von jweilige Schuhe vor dem Hinzufuegen
        SovieleSchuheHastDuSchonTester testMaaximalAnzahlSchuhe = new MehrSchuheSindNichtErlaubtTester(new ArrayList<SchuhPaar>(), new HashMap<SchuhPaar, Integer>(),3);
        testMaaximalAnzahlSchuhe.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testMaaximalAnzahlSchuhe.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testMaaximalAnzahlSchuhe.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testMaaximalAnzahlSchuhe.addSchuhPaar(new SchuhPaar("schwarz",39 , true));
        testerMitAnzahl.toString();

        //Gib jedes Schuhpaar der Collection aus
        for(SchuhPaar schuhe : tester.getSchuhKollektion()) {

            System.out.println(schuhe+"\n");
        }

        // liefert, wie nicht anders zu erwarten, false.
        /*meldung.append(tester.hastDuSchon(gleicheSchuhe) ? gleicheSchuhe +
                " hast du schon" : gleicheSchuhe + " hast du noch nicht");
        System.out.println(meldung);*/

        /**
         * - Eine weitere Möglichkeit, um über die einzelnen Elemente in einer Collection zu iterieren, bietet das Iterator-Interface.
         * - Zunächst musst du dir den Iterator von der Collection holen, das geschieht über die iterator()-Methode-
         * - Das Iterator-Interface definiert insgesamt drei Methoden: hasNext() prüft, ob es noch ein weiteres Schuhpaar (ausgehend
         * von der aktuellen Position) in der Collection gibt, next() liefert dann das nächste Schuhpaar (und rückt intern eine Position
         * weiter). Mit remove() kannst du außerdem Elemente löschen (das lassen wir aber deiner Freundin zuliebe erstmal bleiben).
         * - Da das List-Interface auch eine Methode hat, mit der man gezielt auf ein Element der Liste zugreifen kann, kannst du dort
         * auch die normale for-Schleife statt der foreach-Schleife oder Iteratoren verwenden.
         */
        /*Iterator<SchuhPaar> iterator = tester.getSchuhKollektion().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString()+"\n");
        }*/

    }
}
