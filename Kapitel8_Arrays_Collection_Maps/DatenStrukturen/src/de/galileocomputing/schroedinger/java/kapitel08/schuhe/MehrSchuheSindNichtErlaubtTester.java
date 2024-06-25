/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: MehrSchuheSindNichtErlaubtTester
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Collection;
import java.util.Map;

/**
 * Implementiere einen Schuhtester, der nicht mehr als x gleiche Schuhpaare erlaubt
 */
public class MehrSchuheSindNichtErlaubtTester extends SchuhTesterMitMap {

    //Nur noch das Maximum an erlaubten gleichen Schuhen in einer Objektvariablen verwalten, die über den
    //Konstruktor gesetzt werden kann.
    private int maximum;

    /**
     * - Die Schuhe werden auf die Anzahl „gemappt“, repräsentiert durch einen Integer.
     * - Der Konstruktor bekommt jetzt neben einer Collection noch eine Map, und die Collection wird an den Elternkonstruktor
     * weitergeleitet, alles nicht besonders spannend.
     *
     * @param schuhKollektion
     * @param schuhMappe
     */
    public MehrSchuheSindNichtErlaubtTester(Collection<SchuhPaar> schuhKollektion, Map<SchuhPaar, Integer> schuhMappe, int maximum) {
        super(schuhKollektion, schuhMappe);
        this.maximum = maximum;
    }

    /**
     * - und dann noch addSchuhPaar() überschreiben: Neue Schuhpaare werden nur hinzu￾gefügt,
     * wenn das erlaubte Maximum noch nicht erreicht ist
     * @param schuhe
     */
    @Override
    public void addSchuhPaar(SchuhPaar schuhe) {
        if(super.sovieleHastDuSchon(schuhe) < this.maximum) {
            super.addSchuhPaar(schuhe);
        } else {
            System.err.println("Du hast schon " + this.maximum + " solcher Schuhe.");
        }
    }
}
