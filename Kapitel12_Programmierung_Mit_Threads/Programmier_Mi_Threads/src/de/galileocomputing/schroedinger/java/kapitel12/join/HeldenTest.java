/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HeldenTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.join;

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
         * - Die Threads werden genauso erzeugt wie eben. Allerdings werden die erzeugten Objekte in den zwei Variablen: zwergenThread
         * und elfenThread gespeichert. Zumindest die Variable zwergenThread brauchst du, damit du gleich unten im Elfen-Thread darauf
         * zugreifen kannst.
         */
        final Thread zwergenThread = new Thread(new Runnable() {
            @Override
            public void run() {

                zwerg.aufInDenKampf(nachtelf);
            }
        });

        /**
         * - Mit join() sagst du, dass elfenThread auf den zwergenThread warten sollt. join() wirft übrigens
         * eine InterruptedException.
         * - Das hier wird erst ausgeführt, wenn der zwergenThread fertig ist.
         * - join() ohne Parameter sorgt dafür, dass der Thread in den Zustand Waiting wechselt. Die Methode gibt es aber
         * auch noch in der Variante, in der du über einen Parameter sagen kannst, wie lange gewartet werden soll. Dann wechselt
         * der Thread in den Zustand Timed Waiting.
         */
        final Thread elfenThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    zwergenThread.join();
                } catch (InterruptedException e) {
                    // Exception-Behandlung hier
                }
                nachtelf.aufInDenKampf(zwerg);
            }
        });

        // Ja, und nicht vergessen, die beiden Threads auch zu starten.
        elfenThread.start();
        zwergenThread.start();

    }
}
