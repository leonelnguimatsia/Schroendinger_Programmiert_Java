/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhKarton
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.interfaces.erste.moeglichkeit;

/**
 * - Hier wird das mit dem Typ SchuhPaar typisierte Interface Behaelter implementiert. Der Platzhalter E,
 * den du am Interface angegeben hast, wird durch den konkreten Typ SchuhPaar ersetzt,
 */
public class SchuhKarton implements Behaelter<SchuhPaar>{

    private SchuhPaar inhalt;



    /**
     * - Wie bei typisierten Klassen dient das E in den spitzen Klammern als Platzhalter.
     * - Bei Interfaces gibt es zwar keine Datenfelder und keinen Konstruktor, als Parametertyp
     * bei Methoden kann man den Platzhalter aber trotzdem verwenden, genauso als Typ für einen
     * Rückgabewert.
     * - das heißt, SchuhKarton implementiert nun das Interface Behaelter für den Typ SchuhPaar.
     * Der Rest der Klasse muss also auch diesen Typ verwenden.
     *
     * @param inhalt
     */
    @Override
    public void setInhalt(SchuhPaar inhalt) {
        this.inhalt = inhalt;

    }

    @Override
    public SchuhPaar getInhalt() {
        return inhalt;
    }
}
