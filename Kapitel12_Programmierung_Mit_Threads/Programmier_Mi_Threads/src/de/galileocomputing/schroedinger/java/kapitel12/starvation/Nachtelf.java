/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Nachtelf
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.starvation;

public class Nachtelf extends Held {

    public Nachtelf(String name) {
        super(name);
    }

    @Override
    protected boolean isFertig(){
        return true;
    }

}
