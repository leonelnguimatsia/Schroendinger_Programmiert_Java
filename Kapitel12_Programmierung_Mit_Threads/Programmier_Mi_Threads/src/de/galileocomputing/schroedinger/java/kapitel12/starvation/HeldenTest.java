/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HeldenTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.starvation;

public class HeldenTest {

    public static void main(String[] args) {

        /**
         * - Und nicht vergessen: Damit innerhalb der anonymen Klasse überhaupt auf die beiden
         * lokalen Heldenvariablen zugegriffen werden, müssen diese final sein.
         * - Hier sind sie, die beiden namenlosen Helden
         */
        final Zwerg zwerg = new Zwerg("Zwerg");
        final Nachtelf nachtelf = new Nachtelf("Nachtelf");
        final Toilette toilette = new Toilette();

        /**
         * - Zwei Thread-Objekte, damit du die Threads starten kannst. Jedes davon bekommt eine anonyme Implementierung von Runnable,
         * in der die beiden Helden in den Kampf geschickt werden.
         * - Mit der wait()-Methode sagst du, dass ein Thread auf ein Objekt warten soll. wait() ist übrigens eine der Methoden der Mutterklasse
         * aller Klasse: java.lang.Object.
         * - Damit du wait() aufrufen kannst, muss der Thread das Objekt als Lock haben.
         */
        final Thread zwergenThread = new Thread(new Runnable() {
            @Override
            public void run() {

                //Der Zwerg geht zum Nachtelfen
                synchronized (toilette){
                    try{
                        System.out.println("Zwergen wartet.......");
                        toilette.wait();
                    } catch (InterruptedException e) {
                    }
                }
                zwerg.malGehen(toilette);
            }
        },"ZwergenThread");

        Thread elfenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // und der Nachtelf geht zum Zwerg
                synchronized (toilette){
                    try{
                        System.out.println("Nachelf wartet.......");
                        toilette.wait();
                    }catch (InterruptedException e){
                    }
                }
                nachtelf.malGehen(toilette);
            }
        },"ElfenThread");

        zwergenThread.start();
        elfenThread.start();

        /**
         * - Nachdem zwergenThread und elfenThread gestartet sind, wartet der main-Thread ein bisschen, um sicherzustellen,
         * dass in beiden anderen Threads jeweils die wait()-Methode aufgerufen wurde. 500 Millisekunden reichen dazu dicke.
         * - zwergenThread und elfenThread warten so lange auf toilette, bis auf dem toilette-Objekt notifyAll() aufgerufen wird.
         * Damit werden sozusagen alle auf das toilette-Objekt wartenden Threads benachrichtigt. Alternativ kannst du auch notify() verwenden, damit
         * wird aber nur einer der wartenden Threads benachrichtigt.
         * - Im main-Thread sitzt derweil der Zauberer auf der Toilette, und erst wenn er fertig ist und notifyAll() aufgerufen wurde, können
         * zwergenThread und elfenThread mit der Ausführung weitermachen.
         */
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        synchronized (toilette) {
            System.out.println("Zauberer: \"Ah das tat gut. So der nächste kann.\"");
            toilette.notifyAll();
        }

    }
}
