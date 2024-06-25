/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: AlterKarton
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.mit.generics;


/**
 * Das E in den spitzen Klammern bezeichnet einen formalen Typ und ist quasi ein Platzhalter für eine
 * beliebige Klasse oder ein beliebiges Interface. Der Klasse Karton ist an dieser Stelle egal, welche andere
 * Klasse später den Inhalt repräsentieren soll.
 * @param <E>
 */
public class Karton<E> {

    /**
     * - Den Platzhalter E kannst du innerhalb der Klasse als Referenztyp verwenden
     * - als Parametertyp im Konstruktor,
     * -  als Rückgabetyp von Methoden
     * - und als Parametertyp in Methoden
     */
    private E inhalt;

    public Karton(E inhalt) {
        this.inhalt = inhalt;
    }

    public E getInhalt() {
        return inhalt;
    }

    public void setInhalt(E inhalt) {
        this.inhalt = inhalt;
    }
}
