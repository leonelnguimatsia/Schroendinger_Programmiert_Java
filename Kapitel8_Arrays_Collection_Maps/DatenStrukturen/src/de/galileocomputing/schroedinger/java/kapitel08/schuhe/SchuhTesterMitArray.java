/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhTesterMitArray
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Arrays;
import java.util.Collection;


public class SchuhTesterMitArray implements SolcheSchuheHastDuSchonTester {

    private SchuhPaar[] schuhe;
    /**
     * Da Arrays sich nicht merken, an welcher Stelle das nächste Element eingefügt werden soll, musst
     * du dir das selber in einer Variablen merken.
     */
    private int schuhZaehler = 0;
    public SchuhTesterMitArray() {
        this.schuhe = new SchuhPaar[20];
    }

    /**
     * Nur wenn noch Platz im Array ist, fügen wir das neue Paar Schuhe an die entsprechende Position
     * und erhöhen den internen Schuhzähler
     * @param schuhe
     */
    @Override
    public void addSchuhPaar(SchuhPaar schuhe) {

        // Erste Möglichkeit: Wenn das Array voll ist, muss ich ein neues, größeres Array erstellen und dann alles per Hand vom alten in das neue Array packen.
        /*if (this.schuhZaehler >= this.schuhe.length) {
            SchuhPaar[] schuhKopien = new SchuhPaar[this.schuhe.length + 20];
            for (int i=0; i<this.schuhe.length; i++) {
                schuhKopien[i] = this.schuhe[i];
            }
            this.schuhe = schuhKopien;
        }*/

        /**
         * - Zweite Möglichkeit: Mit der copyOf()-Methode der Helferklasse-Arrays werden alle Objekte aus dem alten Array in das neue kopiert
         * - Erster Parameter: das Array, das kopiert werden soll.
         * - Zweiter Parameter: die Größe des neuen Arrays. Könnte einfacher nicht sein, oder?
         */
        if (this.schuhZaehler >= this.schuhe.length) {
            this.schuhe = Arrays.copyOf(this.schuhe, this.schuhe.length + 20);
        }

        if(this.schuhZaehler < this.schuhe.length) {
            this.schuhe[this.schuhZaehler] = schuhe;
            this.schuhZaehler++;
        }

    }

    /**
     * Wir müssen jedes Paar Schuhe bzw. jede Position in dem Array durchgehen und prüfen, ob die Schuhpaare gleich sind.
     * Außerdem solltest du prüfen, ob überhaupt ein Paar Schuhe an der Position im Array vorhanden ist, denn Position x könnte auch unbelegt sein,
     * das heißt null. Bei Gleichheit ist das Ergebnis true.
     * @param neuesSchuhPaar
     * @return
     */
    @Override
    public boolean hastDuSchon(SchuhPaar neuesSchuhPaar) {

        boolean hastDuSchon = false;
        for (SchuhPaar schuhPaar : this.schuhe) {
            if(schuhPaar != null && schuhPaar.equals(neuesSchuhPaar)) {
                hastDuSchon = true;
            }
        }
        return hastDuSchon;
    }

    /**
     * Die Helfermethode Arrays.asList() wandelt ein Array in eine Liste um. Praktisch, oder?
     * @return eine Lis von Schuhe
     */
    @Override
    public Collection<SchuhPaar> getSchuhKollektion() {

        return Arrays.asList(this.schuhe);
    }
}
