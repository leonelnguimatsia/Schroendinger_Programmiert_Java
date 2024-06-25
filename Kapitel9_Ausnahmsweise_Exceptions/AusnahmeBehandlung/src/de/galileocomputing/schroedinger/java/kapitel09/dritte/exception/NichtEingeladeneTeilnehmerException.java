/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NichtEingeladeneTeilnehmerException
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel09.dritte.exception;

import java.util.List;

public class NichtEingeladeneTeilnehmerException extends Exception {

    private static final long serialVersionUID = -9147043827916533588L;

    private List<String> name;


    /**
     * - Eine Exception ist eine ganz normale Klasse, die von der Java-Standardklasse Exception ableitet. Exception
     * ist die Mutterklasse aller Ausnahmen (Fehler haben übrigens eine andere, dazu gleich mehr)
     * - Über den Konstruktor von Exception kann direkt eine angepasste Fehlernachricht mitgegeben werden, die im Fehlerfall
     * über die Ausnahme geben kann.
     */
    public NichtEingeladeneTeilnehmerException(List<String> name) {

        super("Teilnehmer nicht eingeladen");
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }
}