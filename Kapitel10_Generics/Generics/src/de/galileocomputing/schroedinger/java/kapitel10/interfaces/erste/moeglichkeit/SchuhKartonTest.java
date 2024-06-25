/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhKartonTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.interfaces.erste.moeglichkeit;

public class SchuhKartonTest {

    public static void main(String[] args) {

        SchuhKarton schuhKarton = new SchuhKarton();
        schuhKarton.setInhalt(new SchuhPaar(38,"Pink",true));
        System.out.println(schuhKarton.getInhalt().getFarbe());
    }
}
