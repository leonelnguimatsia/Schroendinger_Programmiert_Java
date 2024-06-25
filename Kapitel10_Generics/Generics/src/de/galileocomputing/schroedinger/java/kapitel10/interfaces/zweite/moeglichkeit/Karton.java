/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Karton
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.interfaces.zweite.moeglichkeit;


import de.galileocomputing.schroedinger.java.kapitel10.interfaces.erste.moeglichkeit.Behaelter;


/**
 * - Anstatt einen konkreten Typ anzugeben, lässt du den Platzhalter E einfach stehen
 * -  Damit das funktioniert, muss deine Klasse aber selbst typisierbar sein
 * @param <E>
 */
public class Karton<E> implements Behaelter<E> {

    /**
     * - Behaelter kann implementiert werden, ohne den konkreten Typ bestimmen zu müssen. Der konkrete Typ ist
     * innerhalb der Klasse noch nicht bekannt, aber für die Implementierung auch nicht notwendig. Karton implementiert
     * Behaelter sozusagen so generisch wie möglich.
     */
    private E inhalt;

    /**
     * - Wie bei typisierten Klassen dient das E in den spitzen Klammern als Platzhalter.
     * - Bei Interfaces gibt es zwar keine Datenfelder und keinen Konstruktor, als Parametertyp
     * bei Methoden kann man den Platzhalter aber trotzdem verwenden, genauso als Typ für einen
     * Rückgabewert.
     * - Noch schnell Setter und Getter implementieren. Das ist auch nichts wirklich Neues. Und schon hast du
     * eine typisierbare Klasse, die ein typisierbares Interface implementiert.
     *
     * @param inhalt
     */
    @Override
    public void setInhalt(E inhalt) {

        this.inhalt = inhalt;
    }

    @Override
    public E getInhalt() {
        return inhalt;
    }
}
