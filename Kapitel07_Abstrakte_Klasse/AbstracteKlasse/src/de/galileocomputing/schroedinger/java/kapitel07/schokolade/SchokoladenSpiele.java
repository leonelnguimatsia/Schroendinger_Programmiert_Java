/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchokoladenSpiele
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.schokolade;

public class SchokoladenSpiele {

    public static void main(String[] args) {

        SchokoladenKeksGemisch schokoladenKeksGemisch = new SchokoladenKeksGemisch();
        SchokoladenSuechtiger schokoladenSuechtiger = new SchokoladenSuechtiger();
        BuchDerWeltrekorde buchDerWeltrekorde = new BuchDerWeltrekorde();
        schokoladenSuechtiger.essen(schokoladenKeksGemisch);
        buchDerWeltrekorde.messen(schokoladenKeksGemisch);

    }
}
