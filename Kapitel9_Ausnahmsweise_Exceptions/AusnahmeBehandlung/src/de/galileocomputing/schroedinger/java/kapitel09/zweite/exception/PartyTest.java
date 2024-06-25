/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: PartyTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;

import java.util.logging.Logger;

public class PartyTest {

    private  static final Logger log = Logger.getLogger(PartyTest.class.getName());

    public static void main(String[] args) {


        Party party = new BigBossParty();
        Firma kartonBossingen = new Firma("Bossingen Karton");
        Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
        party.setLocation(baeckereiSchmitz);

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
            party.teilnehmen(new Person("Frau Schmitz", kartonBossingen, 1400.0));
        } catch (NichtReichGenugException e) {
            log.severe(e.getName() + " verdient nicht genug für diese Big-Boss-Party.");
        } catch (NichtEingeladenerTeilnehmerException | BudeVollException e) {
            log.warning("Anderer Fehler aufgetreten.");
        } finally {
            System.out.println("Waren Sie mit dem Service zufrieden?");
        }

    }
}
