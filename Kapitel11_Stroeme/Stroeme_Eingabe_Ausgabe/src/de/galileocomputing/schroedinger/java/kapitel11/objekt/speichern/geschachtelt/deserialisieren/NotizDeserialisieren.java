/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NotizDeserialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt.deserialisieren;

import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt.Notiz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class NotizDeserialisieren {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(
                InputStream dateiLeser = new FileInputStream("notiz.data");
                ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
        ) {
            Notiz geleseneNotiz = (Notiz) objektLeser.readObject();
            System.out.println(geleseneNotiz.getAutor());
            System.out.println(geleseneNotiz.getNachricht());
        }

    }
}
