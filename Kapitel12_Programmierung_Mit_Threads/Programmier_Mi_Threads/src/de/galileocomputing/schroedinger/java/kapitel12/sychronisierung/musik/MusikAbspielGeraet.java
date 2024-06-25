/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: MusikAbspielGeraet
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.musik;

import de.galileocomputing.schroedinger.java.kapitel12.sychronisierung.tontraeger.Tontraeger;

public abstract class MusikAbspielGeraet {

    /**
     * Wie man einen Tonträger in das abspielgerät einlegt, was passiert, wenn man ihn abspielt,
     * und ob der Tonträger überhaupt unterstützt wird, das unterscheidet sich je nach Art des Abspielgeräts.
     * Auf dieser Abstraktionsebene kann das noch nicht festgelegt werden. Deswegen sind diese Methoden alle abstrakt.
     */

    private Tontraeger tontraeger;

    protected abstract boolean unterstuetzTontraeger(Tontraeger tontraeger);

    protected abstract void einlegen(Tontraeger tontraeger);

    protected abstract void abspielen(Tontraeger tontraeger);

    /**
     * - Prüfen, ob der Tonträger unterstützt wird, einlegen und abspielen. Die einzelnen Schritte sind fix.
     * - Mit dem Schlüsselwort "final" lassen sich die Methode nicht überschrieben werden.
     * - @param tontraeger
     */
    public synchronized void hoeren(Tontraeger tontraeger) {

        if (this.unterstuetzTontraeger(tontraeger)) {
            this.tontraeger = tontraeger;
            this.einlegen(tontraeger);
            this.abspielen(tontraeger);
        } else {
            /**
             * - Die Methode getClass() des Objekts gibt das Klassen-Objekt der Klasse zurück, zu der das Objekt gehört.
             * - Die Methode getSimpleName() gibt den einfachen Namen der Klasse zurück, ohne den vollqualifizierten Paketnamen.
             * - this.getClass().getSimpleName() ist eine Möglichkeit, den Namen der Klasse eines Objekts in Java zu erhalten,
             * ohne den vollen Klassennamen verwenden zu müssen.
             */
            System.err.println(this.getClass().getSimpleName() + " unterstützt " + tontraeger.getClass().getSimpleName() + " nicht.");
        }

    }

    public synchronized Tontraeger auswerfen() {

        Tontraeger tontraeger = this.tontraeger;
        this.tontraeger = null;
        return tontraeger;
    }
}

