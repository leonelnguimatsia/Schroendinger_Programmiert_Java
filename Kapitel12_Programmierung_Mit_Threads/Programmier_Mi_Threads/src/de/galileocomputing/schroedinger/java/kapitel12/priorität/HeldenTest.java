/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HeldenTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.priorität;

public class HeldenTest {

    public static void main(String[] args) {

        /**
         * - Und nicht vergessen: Damit innerhalb der anonymen Klasse überhaupt auf die beiden
         * lokalen Heldenvariablen zugegriffen werden, müssen diese final sein.
         * - Hier sind sie, die beiden namenlosen Helden
         */
        final Zwerg zwerg = new Zwerg("Zwerg");
        final Nachtelf nachtelf = new Nachtelf("Nachtelf");

        /**
         * - Zwei Thread-Objekte, damit du die Threads starten kannst. Jedes davon bekommt eine anonyme Implementierung von Runnable,
         * in der die beiden Helden in den Kampf geschickt werden.
         * - Innerhalb jedes Threads trinken die beiden Helden so lange bis die Ausführung des Threads unterbrochen wird. Das prüfst du mit
         * isInterrupted(). Für dieses Beispiel ist die trinken()-Methode wieder etwas vereinfacht
         *
         */
        final Thread zwergenThread = new Thread(new Runnable() {
            @Override
            public void run() {

                //Der Zwerg geht zum Nachtelfen
                while(!Thread.currentThread().isInterrupted()) {
                    zwerg.trinken();
                }

            }
        },"ZwergenThread");

        Thread elfenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // und der Nachtelf geht zum Zwerg
                while(!Thread.currentThread().isInterrupted()) {
                    nachtelf.trinken();
                }
            }
        },"ElfenThread");

        /**
         * - Der Zwerg bekommt die maximale Priorität,
         * - der Nachtelf die minimale Priorität
         * - Anschließend werden die Threads gestartet und laufen eine Weile, bis sie unterbrochen werden.
         * Einen Thread unter￾brechen kannst du übrigens mit dem Aufruf der Methode interrupt().
         */
        zwergenThread.setPriority(Thread.MAX_PRIORITY);
        elfenThread.setPriority(Thread.MIN_PRIORITY);
        zwergenThread.start();
        elfenThread.start();

        try{
            Thread.sleep(50);
        }catch(InterruptedException e){

        }
        zwergenThread.interrupt();
        elfenThread.interrupt();

    }
}
