/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Korb
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.korb;

public class Korb<E> {

    private E bewohner;


    public E getBewohner() {
        return bewohner;
    }

    public void setBewohner(E bewoher) {
        this.bewohner = bewoher;
    }
}
