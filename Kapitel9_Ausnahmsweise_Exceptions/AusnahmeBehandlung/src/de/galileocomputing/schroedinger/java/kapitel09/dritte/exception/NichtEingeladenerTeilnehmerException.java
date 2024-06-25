/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NichtEingeladenerTeilnehmerException
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.dritte.exception;

public class NichtEingeladenerTeilnehmerException extends Exception {

    private static final long serialVersionUID = 7676438772835347394L;

    private String name;

    public NichtEingeladenerTeilnehmerException(String name) {
        super("Teilnehmer nicht eingeladen");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
