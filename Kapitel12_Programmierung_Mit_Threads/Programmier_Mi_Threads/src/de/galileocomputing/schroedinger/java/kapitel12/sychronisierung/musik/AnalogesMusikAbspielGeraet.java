/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: AnalogesMusikAbspielGeraet
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.musik;

import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.Tontraeger;

public abstract class AnalogesMusikAbspielGeraet extends MusikAbspielGeraet {

    @Override
    public void abspielen(Tontraeger tontraeger) {
        System.out.println("Oh, " + tontraeger.getTitel() + ", und dann auch noch analog, das klingt gut!");
    }
}
