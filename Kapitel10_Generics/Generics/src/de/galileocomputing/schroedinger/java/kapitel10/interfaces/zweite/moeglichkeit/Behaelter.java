/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Behaelter
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.interfaces.zweite.moeglichkeit;

public interface Behaelter<E> {

    /**
     * - Wie bei typisierten Klassen dient das E in den spitzen Klammern als Platzhalter.
     * - Bei Interfaces gibt es zwar keine Datenfelder und keinen Konstruktor, als Parametertyp
     * bei Methoden kann man den Platzhalter aber trotzdem verwenden, genauso als Typ für einen
     * Rückgabewert.
     * @param inhalt
     */
    void setInhalt(E inhalt);
    E getInhalt();
}
