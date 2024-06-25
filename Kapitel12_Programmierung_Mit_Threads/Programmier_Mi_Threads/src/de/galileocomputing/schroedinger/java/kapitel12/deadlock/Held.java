/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Die Basisklasse für unsere Helden ist erstmal noch ganz simpel mit einem Datenfeld, einem Getter
 */
public abstract class Held {

    private String name;
    // Gemeinsames ReentrantLock für die Helden
    private final static ReentrantLock lock = new ReentrantLock();

    public Held(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * - Auf einer Objektinstanz von Held kann von verschiede￾nen Threads aus immer
     * nur eine der beiden Methoden, aber nicht beide gleichzeitig, aufgerufen werden
     * - Die Helden warten ein bisschen
     * @param held
     */
    public void besuchen(Held held) {
        /*synchronized(this) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException exception) {
            }
           //System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());

            //Und das hier ist die kritische Stelle, die den Deadlock auslöst, aber was da passiert, gucken wir uns gleich mal genauer an.
            //held.besuchEmpfangen(this);
        }*/
        System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());

        //Und das hier ist die kritische Stelle, die den Deadlock auslöst, aber was da passiert, gucken wir uns gleich mal genauer an.
        held.besuchEmpfangen(this);
    }

    public void besuchEmpfangen(Held held) {
        /*synchronized (this) {
            System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());
        }*/
        System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());
    }

}
