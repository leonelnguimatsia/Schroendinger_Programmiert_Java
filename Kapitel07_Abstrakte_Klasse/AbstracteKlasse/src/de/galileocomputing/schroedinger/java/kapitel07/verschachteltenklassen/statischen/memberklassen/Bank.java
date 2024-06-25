/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bank
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.verschachteltenklassen.statischen.memberklassen;

public class Bank {

    private double vermoegen = 40.0;

    public static class Tresor {

        private void getInhalt(){
            //System.out.println(vermoegen);
        }
    }


    public Bank(){

        Tresor tresor = new Tresor();
        tresor.getInhalt();
    }
}
