/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KopiererMitMethode
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.kopierer.zweite.möglichkeit;


import java.util.ArrayList;
import java.util.List;

/**
 * - Erstelle eine Klasse Kopierer, die eine Liste von Elementen in eine andere Liste von gleichen Elementen kopiert, oder
 * anders gesagt: Elemente von der einen Liste sollen gelesen und in die andere Liste geschrieben werden.
 * - Jetzt ändern wir mal den Kopierer von eben so, dass man zum Kopieren von CDs und Büchern nicht extra zwei KopiererObjektinstanzen
 * brauchst, sondern nur eine (nicht typisierte) Objektinstanz, die dann alles kopieren kann.
 */
public class Kopierer {

    public static void main(String[] args) {

        Kopierer kopierer = new Kopierer();
        List<Buch> buecher = new ArrayList<>();
        List<CD> cds = new ArrayList<>();

        //Liste mit Buechern befüllen
        List<Buch> buecherKopien = new ArrayList<>();
        kopierer.<Buch>kopiere(buecher,buecherKopien);

        //Liste mit cds befüllen
        List<CD> cdKopien = new ArrayList<>();
        kopierer.<CD>kopiere(cds,cdKopien);
    }

    /**
     * - Für quelle bietet sich ein nach oben beschränkter Wildcard-Typ an, weil Objekte aus der Liste gelesen werden
     * müssen. Daher muss diese Liste mit dem Typ <? extends T> definiert werden.
     * - Und um in ziel schreiben zu können, muss diese Liste mit <? super T> definiert werden, dem nach unten beschränkten
     * - dafür ist die Methode jetzt typisierbar. Der Rest bleibt gleich
     * Wildcard-Typ
     * @param quelle
     * @param ziel
     */
    public <T> void kopiere(List<? extends T> quelle, List<? super T> ziel) {

        for (int i = 0; i < quelle.size(); i++) {

            ziel.set(i, quelle.get(i));
        }
    }
}
