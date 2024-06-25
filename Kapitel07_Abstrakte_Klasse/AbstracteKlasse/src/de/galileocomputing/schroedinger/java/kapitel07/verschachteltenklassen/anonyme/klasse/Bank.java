/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bank
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.verschachteltenklassen.anonyme.klasse;

public class Bank {

    private double vermoegen = 40.0;


    public Bank(){

        Tresor tresor = new Tresor() {
            @Override
            public double getInhalt() {
                return vermoegen;
            }
        };

        tresor.getInhalt();
    }

}
