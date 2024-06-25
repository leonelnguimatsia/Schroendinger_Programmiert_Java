/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KundenDatenKonvertierer
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.kundendatein.konvertieren.einfacher;

import java.io.File;

public interface KundenDatenKonvertierer {

    void konvertiereKundendaten(File quelle, File ziel);
    void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis, File zielVerzeichnis);

}
