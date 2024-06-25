/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Probehoeren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.musik;

import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.CD;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.Kassette;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.LP;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.MP3;

public class Probehoeren {

    public static void main(String[] args) {
        MusikAbspielGeraet schallplattenSpieler = new SchallplattenSpieler();
        schallplattenSpieler.hoeren(new LP("Jimi Hendrix"));
        MusikAbspielGeraet cdPlayer = new CDPlayer();
        cdPlayer.hoeren(new LP("Jimi Hendrix"));
        cdPlayer.hoeren(new CD("Jimi Hendrix"));
        MusikAbspielGeraet mp3Player = new MP3Player();
        mp3Player.hoeren(new MP3("Jimi Hendrix"));
        MusikAbspielGeraet kassettenRekorder = new KassettenRekorder();
        kassettenRekorder.hoeren(new Kassette("Jimi Hendrix"));
    }
}
