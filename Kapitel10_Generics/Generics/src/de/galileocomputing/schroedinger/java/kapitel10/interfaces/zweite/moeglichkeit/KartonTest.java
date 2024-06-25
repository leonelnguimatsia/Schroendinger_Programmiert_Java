/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KartonTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.interfaces.zweite.moeglichkeit;



public class KartonTest {

    public static void main(String[] args) {

        SchuhPaar schuhe = new SchuhPaar(38,"Red",true);
        Karton<SchuhPaar> karton = new Karton<>();
        karton.setInhalt(schuhe);
        System.out.println(karton.getInhalt().getFarbe());

    }
}
