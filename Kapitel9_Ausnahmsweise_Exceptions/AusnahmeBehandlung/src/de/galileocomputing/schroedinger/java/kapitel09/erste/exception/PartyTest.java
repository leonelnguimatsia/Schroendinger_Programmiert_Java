/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: PartyTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.erste.exception;

public class PartyTest {

    public static void main(String[] args) {

        de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Party party = new de.galileocomputing.schroedinger.java.kapitel09.erste.exception.BossingensEinweihungsParty();
        de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma kartonBossingen = new de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma("Bossingen Karton");
        de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma baeckereiSchmitz = new de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma("Bäckerei Schmitz");
        party.setLocation(kartonBossingen);

        /**
         * - Den Quelltext, den eine Exception produ￾zieren könnte, umgibst du mit einem try und geschweiften Klammern.
         * Alles innerhalb dieser Klammern gehört zum try-Block.
         * - Nach dem try-Block kommt catch. Die Exception, die du abfangen möchtest, steht in runden Klammern.
         * Erst mit dem Klassennamen und dann dem Variablennamen. Der Variablenname e ist zwar recht kurz, aber eine gängige
         * Namenskonvention für Exceptions. Der Quelltext, der ausgeführt werden soll, wenn eine Exception gefan￾gen werden soll,
         * steht dann wieder in geschweiften Klammern.
         * - Nicht unbedingt guter Stil ist es, bei der Behandlung einer Exception nur die Standardfehlerausgabe der Exception zu werfen,
         * aber zu Demozwecken soll uns das für den Moment mal reichen. Später sage ich dir noch, wie du deine Exceptions richtig behandeln solltest.
         */
        try {
            party.teilnehmen(new de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Person(baeckereiSchmitz));
        } catch (de.galileocomputing.schroedinger.java.kapitel09.erste.exception.NichtEingeladenerTeilnehmerException e) {
            // hier die Behandlung der Ausnahme
            e.printStackTrace();
        }
    }
}
