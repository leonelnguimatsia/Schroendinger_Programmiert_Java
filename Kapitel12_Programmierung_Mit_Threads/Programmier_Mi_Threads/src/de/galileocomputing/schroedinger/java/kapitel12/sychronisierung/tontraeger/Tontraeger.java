/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Tontraeger
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger;

public abstract class Tontraeger {

    private String titel;

    public Tontraeger(String titel) {
        super();
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
