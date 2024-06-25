/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Person
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

public class Person {

    private Katze katze;
    private Wohnung wohnung;

    public void setKatze(Katze katze) {
        this.katze = katze;
    }

    public void setWohnung(Wohnung wohnung) {
        this.wohnung = wohnung;
    }

    public Wohnung getWohnung() {
        return wohnung;
    }

    public void haushaltMachen(){

        if(this.katze != null){
            this.katze.fuettern();
        }
    }
}
