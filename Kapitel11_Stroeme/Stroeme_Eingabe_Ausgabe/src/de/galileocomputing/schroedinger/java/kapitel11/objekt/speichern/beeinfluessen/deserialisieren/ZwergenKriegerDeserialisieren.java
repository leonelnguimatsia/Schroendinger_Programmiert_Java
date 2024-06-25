/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZwergenKriegerDeserialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen.deserialisieren;

import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen.ZwergenKrieger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ZwergenKriegerDeserialisieren {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(
                InputStream dateiLeser = new FileInputStream("krieger.data");
                ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
        ) {
            ZwergenKrieger gelesenerKrieger = (ZwergenKrieger) objektLeser.readObject();
            System.out.println(gelesenerKrieger.getName());
            System.out.println(gelesenerKrieger.getErfahrung());
            System.out.println(gelesenerKrieger.getGroesse());
        }

    }
}
