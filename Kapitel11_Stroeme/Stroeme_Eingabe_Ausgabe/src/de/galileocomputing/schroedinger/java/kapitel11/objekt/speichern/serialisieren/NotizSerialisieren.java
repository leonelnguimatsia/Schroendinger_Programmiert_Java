/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NotizSerialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.serialisieren;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class NotizSerialisieren {

    public static void main(String[] args) throws Exception, ClassNotFoundException {

        Notiz notiz = new Notiz("Schrödinger","Mein erstes gespeichertes Objekt");

        /**
         * - Wir wollen das Objekt ja in eine Datei speichern, deswegen brauchen wir einen FileOutputStream und den packen wir
         * in einen ObjectOutputStream. Den brauchen wir, weil der weiß, wie man Objekte serialisiert.
         * - Wie die Zieldatei heißt, ist eigentlich egal, „data“ ist aber eine geläufige Dateiendung für serialisierte Objekte.
         */
        try (
            OutputStream dateiSchreiber = new FileOutputStream("notiz.data");
            ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber);
        ){
            // Hiermit wird das Objekt in den ObjectOutputStream geschrieben, der es dann in den FileOutputStream schreibt.
            objektSchreiber.writeObject(notiz);
            // Hiermit sagst du, dass du jetzt mit dem Schreiben fertig bist
            objektSchreiber.flush();
        }
    }
}
