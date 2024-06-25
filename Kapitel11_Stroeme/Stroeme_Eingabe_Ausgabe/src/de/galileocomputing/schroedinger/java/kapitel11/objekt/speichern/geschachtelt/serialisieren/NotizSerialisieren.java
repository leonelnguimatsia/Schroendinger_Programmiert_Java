/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NotizSerialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt.serialisieren;

import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt.Autor;
import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt.Notiz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class NotizSerialisieren {

    public static void main(String[] args) throws Exception, ClassNotFoundException {

        Notiz notiz = new Notiz(new Autor("Marco", "Schrödinger"), "Mein erstes gespeichertes Objekt.");

        try(
                OutputStream dateiSchreiber = new FileOutputStream("notiz.data");
                ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
        ) {
            objektSchreiber.writeObject(notiz);
            objektSchreiber.flush();
        }

    }
}
