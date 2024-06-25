/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HeldenTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.livelock;

public class HeldenTest {

    public static void main(String[] args) {

        /**
         * - Und nicht vergessen: Damit innerhalb der anonymen Klasse überhaupt auf die beiden
         * lokalen Heldenvariablen zugegriffen werden, müssen diese final sein.
         * - Hier sind sie, die beiden namenlosen Helden
         */
        final Zwerg zwerg = new Zwerg("Zwerg");
        final Nachtelf nachtelf = new Nachtelf("Nachtelf");
        final Bier bier = new Bier(zwerg);

        /**
         * - Zwei Thread-Objekte, damit du die Threads starten kannst. Jedes davon bekommt eine anonyme Implementierung von Runnable,
         * in der die beiden Helden in den Kampf geschickt werden.
         */
        final Thread zwergenThread = new Thread(new Runnable() {
            @Override
            public void run() {

                //Der Zwerg geht zum Nachtelfen
                zwerg.trinken(bier,nachtelf);
            }
        },"ZwergenThread");

        Thread elfenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // und der Nachtelf geht zum Zwerg
                nachtelf.trinken(bier,zwerg);
            }
        },"ElfenThread");

        zwergenThread.start();
        elfenThread.start();
    }
}
