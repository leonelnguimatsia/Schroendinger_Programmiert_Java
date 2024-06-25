/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: DigitalesMusikAbspielGeraet
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.musik;

import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.Tontraeger;

public abstract class DigitalesMusikAbspielGeraet extends MusikAbspielGeraet {

    @Override
    public void abspielen(Tontraeger tontraeger) {
        System.out.println("Lass mich raten, das soll " + tontraeger.getTitel() +
                " sein. Ist aber ziemlich stark komprimiert, oder?");
    }
}
