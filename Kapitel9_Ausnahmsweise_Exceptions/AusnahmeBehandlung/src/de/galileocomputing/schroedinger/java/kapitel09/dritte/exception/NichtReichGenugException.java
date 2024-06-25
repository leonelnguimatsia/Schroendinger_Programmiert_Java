/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NichtReichGenugException
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.dritte.exception;

public class NichtReichGenugException extends NichtEingeladenerTeilnehmerException {

    private static final long serialVersionUID = -2413873084083697041L;

    /**
     * - Eine Exception ist eine ganz normale Klasse, die von der Java-Standardklasse Exception ableitet. Exception
     * ist die Mutterklasse aller Ausnahmen (Fehler haben übrigens eine andere, dazu gleich mehr)
     * - Über den Konstruktor von Exception kann direkt eine angepasste Fehlernachricht mitgegeben werden, die im Fehlerfall
     * über die Ausnahme geben kann.
     *
     * @param name
     */
    public NichtReichGenugException(String name) {
        super(name);
    }
}
