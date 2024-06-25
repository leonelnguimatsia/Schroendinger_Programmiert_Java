/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NichtEingeladenerTeilnehmerException
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;

public class NichtEingeladenerTeilnehmerException extends Exception {

    private static final long serialVersionUID = 7676438772835347394L;

    private String name;


    /**
     * - Eine Exception ist eine ganz normale Klasse, die von der Java-Standardklasse Exception ableitet. Exception
     * ist die Mutterklasse aller Ausnahmen (Fehler haben übrigens eine andere, dazu gleich mehr)
     * - Über den Konstruktor von Exception kann direkt eine angepasste Fehlernachricht mitgegeben werden, die im Fehlerfall
     * über die Ausnahme geben kann.
     */
    public NichtEingeladenerTeilnehmerException(String name) {

        super("Teilnehmer nicht eingeladen");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}