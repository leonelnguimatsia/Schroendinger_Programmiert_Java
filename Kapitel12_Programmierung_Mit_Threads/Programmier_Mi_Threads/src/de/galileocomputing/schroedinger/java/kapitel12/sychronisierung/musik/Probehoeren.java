/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Probehoeren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.musik;


import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.LP;

public class Probehoeren {

    public static void main(String[] args) {

        final MusikAbspielGeraet plattenSpieler = new SchallplattenSpieler();
        (new Thread(new Runnable(){
            public void run(){
                plattenSpieler.hoeren(new LP("The Doors"));
            }
        },"Hörer")).start();

        (new Thread(new Runnable() {
            @Override
            public void run() {
                plattenSpieler.auswerfen();
            }
        },"Auswerfer")).start();
    }
}
