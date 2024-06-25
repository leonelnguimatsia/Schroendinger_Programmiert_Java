/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bier
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.livelock;

//Hier steht eine simple neue Klasse für das Bier, das immer nur einen Besitzer haben kann
public class Bier {

    private Held besitzer;

    public Bier(Held held) {
        this.besitzer = held;
    }

    public synchronized Held getBesitzer() {
        return besitzer;
    }

    public synchronized void setBesitzer(Held besitzer) {
        this.besitzer = besitzer;
    }

    public synchronized void trinken(){

        System.out.printf("%s hat getruken!", besitzer.getName());
    }
}
