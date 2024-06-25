/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: PartyTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.dritte.exception;

import java.util.ArrayList;
import java.util.List;

public class PartyTest {


    public static void main(String[] args) {

        /**
         * - Den Quelltext, den eine Exception produ￾zieren könnte, umgibst du mit einem try und geschweiften Klammern.
         * Alles innerhalb dieser Klammern gehört zum try-Block.
         * - Nach dem try-Block kommt catch. Die Exception, die du abfangen möchtest, steht in runden Klammern.
         * Erst mit dem Klassennamen und dann dem Variablennamen. Der Variablenname e ist zwar recht kurz, aber eine gängige
         * Namenskonvention für Exceptions. Der Quelltext, der ausgeführt werden soll, wenn eine Exception gefan￾gen werden soll,
         * steht dann wieder in geschweiften Klammern.
         * - Nicht unbedingt guter Stil ist es, bei der Behandlung einer Exception nur die Standardfehlerausgabe der Exception zu werfen,
         * aber zu Demozwecken soll uns das für den Moment mal reichen. Später sage ich dir noch, wie du deine Exceptions richtig behandeln solltest.
         * - finally-Block() ist immer dann sinnvoll, wenn bestimmter Code immer ausgeführt werden soll, unabhängig davon,
         * ob eine Exception aufgetreten ist oder nicht.
         */
        try {
            partyStarten();
        } catch (NichtEingeladeneTeilnehmerException e) {
            System.out.println(e.getMessage());
        }
        //partyStarten2();
    }


        /**
         * - Exceptions weiterwerfen: throws an der Methodendeklaration
         */
        private static void partyStarten() throws NichtEingeladeneTeilnehmerException {

            Party party = new BigBossParty();
            Firma kartonBossingen = new Firma("Bossingen Karton");
            Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
            Firma firmaReichenhausen = new Firma("Reichenhausen");
            party.setLocation(kartonBossingen);
            List<Person> personen = new ArrayList<>();
            personen.add(new Person("Frau Schmitz", baeckereiSchmitz, 14000.0));
            personen.add(new Person("Herr von Reichenhausen", firmaReichenhausen, 50000.0));
            List<String> namen = new ArrayList<>();

            /**
             * Tritt eine NichtEingeladener￾TeilnehmerException auf, wird der Name der Person der Liste hinzugefügt.
             */
            for (Person person : personen) {
                try {
                    party.teilnehmen(person);
                } catch (NichtEingeladenerTeilnehmerException e) {
                    namen.add(person.getName());
                }
            }
            /**
             *  Nachdem alle Personen „verarbeitet“ wurden, wird hier geprüft, ob irgendwelche Personen nicht
             * eingeladen waren. Ist dies der Fall, wird eine NichtEingeladene￾TeilnehmerException geworfen.
             */
            if(!namen.isEmpty()) {
                throw new NichtEingeladeneTeilnehmerException(namen);
            }

        }

    private static void partyStarten2() {
            Party party = new BigBossParty();
            Firma kartonBossingen = new Firma("Bossingen Karton");
            Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
            Firma firmaReichenhausen = new Firma("Reichenhausen");
            party.setLocation(kartonBossingen);
            List<Person> personen = new ArrayList<>();
            personen.add(new Person("Frau Schmitz", baeckereiSchmitz, 1400.0));
            personen.add(new Person("Herr von Reichenhausen", firmaReichenhausen, 50000.0));
            for (Person person : personen) {
                try {
                    party.teilnehmen(person);
                } catch (NichtEingeladenerTeilnehmerException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

}
