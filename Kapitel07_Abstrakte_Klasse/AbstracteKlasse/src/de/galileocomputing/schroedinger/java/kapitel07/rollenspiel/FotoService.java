/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: FotoService
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.rollenspiel;

public class FotoService {

    public static void main(String[] args) {

        heldenFotoMachen(new Zauberer());
        heldenFotoMachen(new Superman());

    }
    public static void heldenFotoMachen(Held held){

        held.heldenhaftPosieren();
    }
}
