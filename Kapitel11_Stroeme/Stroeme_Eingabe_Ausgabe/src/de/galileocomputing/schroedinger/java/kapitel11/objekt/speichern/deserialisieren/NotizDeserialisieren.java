/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NotizDeserialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.deserialisieren;

import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.serialisieren.Notiz;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class NotizDeserialisieren {

    public static void main(String[] args) throws Exception, ClassNotFoundException{

        /**
         * - Wir lesen aus einer Datei, also brauchen wir einen FileInputStream und den packen wir in einen ObjectInputStream.
         * Der weiß, wie man Objekte deserialisiert.
         *
         */
        try(
                InputStream dateiLeser = new FileInputStream("notiz.data");
                ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser);

        ){
            //Hier wird das Objekt gelesen. Allerdings musst du hierbei immer casten, Generics helfen dir
            //hier leider nicht weiter, denn ObjectInputStream ist leider nicht typisierbar.
            Notiz geleseneNotiz = (Notiz) objektLeser.readObject();

            //Zum Vergleich geben wir hier noch die Eigenschaften des deserialisierten Objekts aus.
            System.out.println(geleseneNotiz.getAutor());
            System.out.println(geleseneNotiz.getNachricht());
        }
    }
}
