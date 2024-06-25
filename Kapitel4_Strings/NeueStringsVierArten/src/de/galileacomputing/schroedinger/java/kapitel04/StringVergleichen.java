/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringVergleichen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringVergleichen {

    public static void main(String[] args) {

        /**
         * - Wenn dir die Groß- und Kleinschreibung bei zwei Strings egal ist, kannst du
         * alternative "equalsIgnoreCase()" verwenden.
         * - Wenn du prüfen möchtest, ob zwei Variablen auf dasselbe Objekt zeigen, kannst du == verwenden.
         * - Wenn du aber wissen möchtest, ob zwei Objekte von ihrer bedeutung her gleich, bzw. bei Strings, ob zwei
         * zwei Strings den gleichen Inhalt haben, nimmst du equals().
         */
        String name = "Schrödinger";
        String nochEinName = "Schrödi" + "nger";
        boolean sindGleich = name.equals(nochEinName);
        System.out.println(sindGleich);
    }
}
