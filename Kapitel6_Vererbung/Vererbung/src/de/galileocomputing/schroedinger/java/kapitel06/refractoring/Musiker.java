/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Musiker
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.refractoring;

public class Musiker extends Kuenstler {

    private Band band;

    public void musizieren() {
        System.out.println("OO Mmmmmmmmh, OO Mmmmmmmmh");
    }

    public Musiker(String kunstlerName, String name, String vorname){

        super(kunstlerName, name, vorname);
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
