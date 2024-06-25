/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Buchmesse
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.buch;

public class BuchMesse {

    public static void main(String[] args) {

        Buch meinBuch = new Buch();
        meinBuch.setAutor("William Schakespeare");
        meinBuch.setTitel("Romeo und Julia");
        meinBuch.setSeiteAnzahl(400);
        meinBuch.setGebunden(false);
        meinBuch.lesen();
    }
}
