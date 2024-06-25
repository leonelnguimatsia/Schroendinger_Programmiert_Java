/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Kuenstler
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.refractoring;

public class Kuenstler extends Person {

    private String kuenstlerName;


    public Kuenstler(String kuenstlerName, String name, String vorname) {
        super(name,vorname);
        this.kuenstlerName = kuenstlerName;
    }
}
