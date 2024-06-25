/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Katze
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

public class Katze {

    private Person herrchen;
    public Katze(Person herrchen) {
        herrchen.setKatze(this);
        this.herrchen = herrchen;
    }

    protected Person getHerrchen(){
        return herrchen;
    }

    public void fuettern(){
        Wohnung wohnung = this.getHerrchen().getWohnung();
        if(wohnung != null){
            wohnung.rumLaufen(this);
        }
    }
}
