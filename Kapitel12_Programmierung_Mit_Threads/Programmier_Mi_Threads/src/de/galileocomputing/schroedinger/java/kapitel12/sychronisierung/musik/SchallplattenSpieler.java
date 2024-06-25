/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchallplattenSpieler
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.musik;

import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.Schallplatte;
import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.Tontraeger;

public class SchallplattenSpieler extends AnalogesMusikAbspielGeraet {
    @Override
    protected boolean unterstuetzTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof Schallplatte;
    }

    @Override
    protected void einlegen(Tontraeger tontraeger) {

        System.out.println("Tee zubereiten, ganz gemütlich die Schallplatte aus der Hülle nehmen, " +
                "laaaangsam auflegen und vorsichtig mit dem Tonabnehmer sein.");
    }

    @Override
    public Schallplatte auswerfen() {
        return (Schallplatte) super.auswerfen();
    }
}

