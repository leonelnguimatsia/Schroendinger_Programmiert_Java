/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Enums Sender
 *
 ********************************************************************************/
package de.galileocomputing.schroedinger.java.kapitel07.konstante.enums;

public enum Sender {

    //ARD, ZDF, RTL, SAT1;
    ARD(true), ZDF(false), RTL(false), SAT1(true);

    private boolean findeIchGut;

    /**
     * Enums können sogar Konstruktoren haben. Allerdings kannst du die nur innerhalb deiner Enum aufrufen.
     * @param findeIchGut
     */
    Sender(boolean findeIchGut) {

        this.findeIchGut = findeIchGut;
    }

    //Methoden sind auch erlaubt,
    public boolean istGuterSender() {

        return this.findeIchGut;
    }
}
