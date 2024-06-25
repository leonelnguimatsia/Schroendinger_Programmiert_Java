/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Gitarrist
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.refractoring;

public class Gitarrist extends Musiker {

    public Gitarrist(String kunstlerName, String name, String vorname) {
        super(kunstlerName, name, vorname);
    }

    @Override
    public void musizieren() {
        System.out.println("Tschiiiiiingzäääängggggg.");
    }

}
