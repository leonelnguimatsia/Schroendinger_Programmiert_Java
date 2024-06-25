/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: IrgendwasImKartons
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.typisierte.methoden;

import de.galileocomputing.schroedinger.java.kapitel10.mit.generics.Karton;
import de.galileocomputing.schroedinger.java.kapitel10.wildcard.nach.oben.beschränkte.Katze;

public class IrgendwasImKartons {

    public static void main(String[] args) {

        Katze katze = new Katze("Lisa");
        Karton kartonMitKatze = new Karton<>(katze);

        /**
         * - Wenn du die Methode aufrufst, schreibst du den konkreten Typ einfach in spitzen Klammern vor den
         * Methodennamen.
         * - Weil ich den Typ hier auf Tier setze, ist als Parameter für diesen Aufruf der Methode Karton<? extends Tier> gefragt.
         * Und wie du jetzt wissen solltest, können wir dafür auch ein Karton<Katze> nehmen.
         */
        IrgendwasImKartons.<Katze>machWas(kartonMitKatze);

    }

    /**
     * - Den (oder die) Typ(en) schreibst du vor den Rückgabewert der Methode.
     * - Eine typisierte Methode muss nicht unbedingt static sein. Funktioniert für nichtstatische Methoden.
     * - Den (oder die) Typ(en) kannst du dann auch zum Beispiel innerhalb von Wildcards verwenden.genauso.
     * - Um die Wiederverwendbarkeit von Quellcode auf die Spitze zu treiben, ist es sogar möglich, einzelne Methoden
     * zu typisieren. Der Typ steht dabei direkt vor dem Rückgabewert.
     * @param karton
     * @param <T>
     */
    public static <T> void machWas(Karton<? extends T> karton) {

        System.out.println("Name der Katze ins Kartons: "+karton.getInhalt());
    }
}
