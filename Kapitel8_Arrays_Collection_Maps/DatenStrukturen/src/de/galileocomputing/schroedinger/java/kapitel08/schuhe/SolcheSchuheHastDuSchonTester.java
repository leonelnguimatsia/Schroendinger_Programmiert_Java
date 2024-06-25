/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SolcheSchuheHastDuSchonTester
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Collection;

public interface SolcheSchuheHastDuSchonTester {

    void addSchuhPaar(SchuhPaar schuhPaar);
    boolean hastDuSchon(SchuhPaar schuhPaar);
    Collection<SchuhPaar> getSchuhKollektion();
}
