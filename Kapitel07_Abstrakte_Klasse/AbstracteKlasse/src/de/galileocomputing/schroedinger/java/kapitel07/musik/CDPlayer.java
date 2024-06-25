/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: CDPlayer
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.musik;

import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.CD;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.Tontraeger;

public class CDPlayer extends DigitalesMusikAbspielGeraet{

    /**
     * Ob ein Tonträger unterstützt wird, kannst du über einen instanceof-Check prüfen.
     * Beachte: CDPlayer akzeptiert CD, dadurch dass die Klasse generell alles vom Typ CD akzeptiert.
     * @param tontraeger
     * @return Instanz von dieser Klasse
     */
    @Override
    protected boolean unterstuetzTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof CD;
    }

    /**
     * Das Einlegen des Tonträgers unterscheidet sich auch überall.
     * Beim MP3Player bleibt diese Methode leer. Das geht auch.
     * @param tontraeger
     */
    @Override
    protected void einlegen(Tontraeger tontraeger) {

        System.out.println("Aufmachen. Einlegen. Zumach... Ah... Falsch eingelegt. Schnell nochmal auf. Richtig einlegen. Zumachen.");

    }

    /**
     * Beim Auswerfen profitieren wir davon, dass in Java kovariante Rückgabewerte erlaubt sind.
     * Das heißt, wir können hier alles zurückgeben, was mit Tontraeger kompatibel ist.
     * Um zu garantieren, dass die tontraeger-Variable auf null gesetzt wird, rufen wir direkt auch super.auswerfen() auf.
     * @return null
     */
    @Override
    public CD auswerfen(){

        return (CD) super.auswerfen();
    }
}
