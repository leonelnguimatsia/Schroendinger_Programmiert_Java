/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: MachWasTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.mach.was;

public class MachWasTest {

    public static void main(String[] args) {

        //Wenn deine Klasse von Thread ableitet, kannst du direkt auf ihr die start()-Methode aufrufen
        new MachWas().start();

        /**
         * - ansonsten „wrappst“ du deine Runnable-Implementierung mit einem
         * Thread-Objekt und rufst auf letzterem die start()-Methode auf
         */
        (new Thread(new MachAuchWas())).start();
    }
}
