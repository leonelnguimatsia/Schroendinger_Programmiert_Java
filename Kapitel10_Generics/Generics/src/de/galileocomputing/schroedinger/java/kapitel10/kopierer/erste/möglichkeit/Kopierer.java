/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KopiererMitMethode
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.kopierer.erste.möglichkeit;


import java.util.ArrayList;
import java.util.List;

/**
 * - Erstelle eine Klasse Kopierer, die eine Liste von Elementen in eine andere Liste von gleichen Elementen kopiert, oder
 * anders gesagt: Elemente von der einen Liste sollen gelesen und in die andere Liste geschrieben werden.
 * - Damit der Kopierer sowohl für Bücher als auch für CDs funktioniert, nehmen wir einen generischen Typ. Der kann dann bei der
 * Instanziierung der Klasse durch den konkreten Typ CD oder Buch ersetzt werden
 */
public class Kopierer<T> {

    public static void main(String[] args) {

        List<Buch> buecher = new ArrayList<>();
        List<Buch> buecherKopien = new ArrayList<>();
        Kopierer<Buch> buchKopierer = new Kopierer<>();
        buchKopierer.kopiere(buecher, buecherKopien);

        List<CD> cds = new ArrayList<>();
        List<CD> cdKopien = new ArrayList<>();
        Kopierer<CD> cdKopierer = new Kopierer<>();
        cdKopierer.kopiere(cds, cdKopien);
    }

    /**
     * - Für quelle bietet sich ein nach oben beschränkter Wildcard-Typ an, weil Objekte aus der Liste gelesen werden
     * müssen. Daher muss diese Liste mit dem Typ <? extends T> definiert werden.
     * - Und um in ziel schreiben zu können, muss diese Liste mit <? super T> definiert werden, dem nach unten beschränkten
     * Wildcard-Typ
     * @param quelle
     * @param ziel
     */
    public void kopiere(List<? extends T> quelle, List<? super T> ziel) {

        for (int i = 0; i < quelle.size(); i++) {

            ziel.set(i, quelle.get(i));
        }
    }
}
