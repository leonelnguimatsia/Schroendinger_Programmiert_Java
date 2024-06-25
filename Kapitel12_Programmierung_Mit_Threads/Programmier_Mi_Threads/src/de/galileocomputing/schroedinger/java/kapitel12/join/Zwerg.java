/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Zwerg
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.join;

public class Zwerg extends Held {

    public Zwerg(String name) {
        super(name);
    }

    /**
     * - einer abstrakten Methode aufInDenKampf(), deren Parameter der jeweils andere Held ist, mit dem in den Kampf gezogen werden soll.
     * - Auch der Zwerg hat seine eigene Vorstellung davon, wie aufInDenKampf() aussehen muss.
     * - allerdings hat er es nicht ganz so eilig wie der Nachtelf. Mit Thread.sleep() wird hier nachgebildet, dass er erstmal 5 Sekunden
     * wartet, bevor er dann endlich auch soweit ist und mit in den Kampf zieht.
     *
     * @param held
     */
    @Override
    public void aufInDenKampf(Held held) {

        System.out.printf("%s: \"Auuuuufstääääähnnnn!!!!\"\n", this.getName());
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.printf("%s: (etwas verspätet): \"Gäääähn, uff, guten Morgen, ich komme, ich komme.\"%n", this.getName());
    }
}
