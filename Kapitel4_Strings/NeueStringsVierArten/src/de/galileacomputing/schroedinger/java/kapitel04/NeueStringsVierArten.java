/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NeueStringsVierArten
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;


public class NeueStringsVierArten {

    public static void main(String[] args) {

        /** 1. Der Speicherfresser
         * String sind Objekte, und die werden in der Regel mit new-Operator erstellt.
         */
        String beispiel = new String("Bla Bla");

        /** 2. Der Recycler
         *  die verkürzte Schreibweise
         */
        String nochEinBeispiel = "Noch mehr bla bla";

        /** 3. Der Buchstabenfetischist
         * String können auch aus Array von einzelnen Buchstaben erzeugt werden.
         * Das funktioniert allerdings nur über den Konstruktor.
         */
        char[] buchstaben = {'B', 'l', 'a', 'b', 'l', 'a'};
        String nochEinAnderesBeispiel = new String(buchstaben);

        /** 4. Der Bastler
         * eine weitere Besonderheit gegenüber anderen Java-Objekten ist, dass String sogar den
         * +-Operator unterstützen
         */
        String undNochEinAnderesBeispiel = "Bla" + "bla";

        System.out.println( "1. Der Speicherfresser: "+beispiel+
                           "\n2. Der Recycler: "+nochEinBeispiel+
                           "\n3. Der Buchstabenfetischist: "+nochEinAnderesBeispiel+
                           "\n4. Der Bastler: "+undNochEinAnderesBeispiel);
    }
}