/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Krieger
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen;

//Diese Klasse ist nicht serialisierbar
public class Krieger {

    private String name;

    private int erfahrung;

    public Krieger() {
    }

    public Krieger(String name, int erfahrung) {
        super();
        this.name = name;
        this.erfahrung = erfahrung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

}
