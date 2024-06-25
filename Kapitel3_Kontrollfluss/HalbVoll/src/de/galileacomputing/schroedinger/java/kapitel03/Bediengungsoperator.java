/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bediengungsoperator
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class Bediengungsoperator {

    public static void main(String[] args) {

        int fuellhoeheInML = 125;

       /* String nachricht = (fuellhoeheInML == 125)
                ? "Das Glas ist halb voll."
                : "Das Glas ist nicht habl voll.";*/

       // System.out.println(nachricht);

        System.out.println((fuellhoeheInML == 125)
        ? "Das Glas ist halb voll."
        : "Das Glas ist nicht halb voll.");
    }
}
