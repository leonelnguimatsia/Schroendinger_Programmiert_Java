/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: MP3Player
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.musik;

import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.MP3;
import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.Tontraeger;

public class MP3Player extends DigitalesMusikAbspielGeraet{

    /**
     * Ob ein Tonträger unterstützt wird, kannst du über einen instanceof-Check prüfen.
     * Beachte: MP3Player akzeptiert MP3, dadurch dass die Klasse generell alles vom Typ MP3 akzeptiert.
     * @param tontraeger
     * @return Instanz von dieser Klasse
     */
    @Override
    protected boolean unterstuetzTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof MP3;
    }

    /**
     * Das Einlegen des Tonträgers unterscheidet sich auch überall.
     * Beim MP3Player bleibt diese Methode leer. Das geht auch.
     * @param tontraeger
     */
    @Override
    protected void einlegen(Tontraeger tontraeger) {

    }

    /**
     * Das Abspielen überschreiben wir nur beim KassettenRekorder und beim MP3Player.
     * Beachte, dass im Fall des MP3Player zusätzlich die abspielen()-Methode der Oberklasse aufgerufen wird
     * @param tontraeger
     */
    @Override
    public void abspielen(Tontraeger tontraeger) {
        System.out.println("Was soll das heißen, \"Kann Datei '" + tontraeger.
                getTitel() + ".mp3' nicht finden\"?");
    }

    /**
     * Beim Auswerfen profitieren wir davon, dass in Java kovariante Rückgabewerte erlaubt sind.
     * Das heißt, wir können hier alles zurückgeben, was mit Tontraeger kompatibel ist.
     * Um zu garantieren, dass die tontraeger-Variable auf null gesetzt wird, rufen wir direkt auch super.auswerfen() auf.
     * @return null
     */
    @Override
    public MP3 auswerfen() {
        return (MP3) super.auswerfen();
    }
}

