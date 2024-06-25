/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchokoladenKeksGemisch
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.schokolade;

public class SchokoladenKeksGemisch implements SchokoRiegel, LaengstePralineDerWelt {
    @Override
    public double getLaenge() {
        return 20;
    }

    @Override
    public boolean istLecker() {
        return true;
    }
}
