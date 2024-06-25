/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Wohnung
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

public class Wohnung {

    private Vase vase;

    public Wohnung(){
        this.vase = new Vase();
    }

    public void rumLaufen(Katze katze){
        this.vase.umfallen();
    }

    public void putzen(){

    }

}
