/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Nachtelf
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.helden;

public class Nachtelf extends Held{

    public Nachtelf(String name) {
        super(name);
    }

    /**
     * - einer abstrakten Methode aufInDenKampf(), deren Parameter der jeweils andere
     * Held ist, mit dem in den Kampf gezogen werden soll.
     * - Die Implementierung der aufInDenKampf()-Methode. Der Elf hat’s eilig, er will direkt in den Kampf.
     * - Ach so, ja, das hier kann ich dir hier schon mal erklären. Das „Formatierungskapitel“ haben wir zwar noch vor uns,
     * aber so viel schon mal vorweg: Mit der printf()-Methode kannst du Strings formatieren, hier zum Beispiel wird das %s
     * in dem String durch den Wert ersetzt, der von this.getName() zurückgegeben wird, und für das %n wird eine neue Zeile begonnen.
     * Praktisch oder?
     *
     * @param held
     */
    @Override
    public void aufInDenKampf(Held held) {

        System.out.printf("%s: Auf geht's! In den Kampf!\n", this.getName());
    }
}
