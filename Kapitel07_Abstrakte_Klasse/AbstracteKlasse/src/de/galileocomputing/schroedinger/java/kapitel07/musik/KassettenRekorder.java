/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KassettenRekorder
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.musik;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.Kassette;
import de.galileocomputing.schroedinger.java.kapitel07.tontraeger.Tontraeger;

public class KassettenRekorder extends AnalogesMusikAbspielGeraet {

    /**
     * Ob ein Tonträger unterstützt wird, kannst du über einen instanceof-Check prüfen.
     * Beachte: KassettenRekorder akzeptiert Kassette, dadurch dass die Klasse generell alles vom Typ Kassette akzeptiert.
     * @param tontraeger
     * @return Instanz von dieser Klasse
     */
    @Override
    protected boolean unterstuetzTontraeger(Tontraeger tontraeger) {

        return tontraeger instanceof Kassette;
    }

    /**
     * Das Einlegen des Tonträgers unterscheidet sich auch überall.
     * Beim MP3Player bleibt diese Methode leer. Das geht auch.
     * @param tontraeger
     */
    @Override
    protected void einlegen(Tontraeger tontraeger) {

        System.out.println("Aufmachen. Einlegen. Zumachen.");
    }

    /**
     * Das Abspielen überschreiben wir nur beim KassettenRekorder und beim MP3Player.
     * Beachte, dass im Fall des Kassettenrekorders zusätzlich die abspielen()-Methode der Oberklasse aufgerufen wird
     * @param tontraeger
     */
    @Override
    public void abspielen(Tontraeger tontraeger) {
        super.abspielen(tontraeger);
        System.out.println("Och nö, Werbung, Driss, Radiomitschnitte!");
    }

    /**
     * Beim Auswerfen profitieren wir davon, dass in Java kovariante Rückgabewerte erlaubt sind.
     * Das heißt, wir können hier alles zurückgeben, was mit Tontraeger kompatibel ist.
     * Um zu garantieren, dass die tontraeger-Variable auf null gesetzt wird, rufen wir direkt auch super.auswerfen() auf.
     * @return null
     */
    @Override
    public Kassette auswerfen(){

        return (Kassette) super.auswerfen();
    }
}
