/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZwergenKriegerSerialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen.serialisieren;

import de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen.ZwergenKrieger;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ZwergenKriegerSerialisieren {

    public static void main(String[] args) throws Exception, ClassNotFoundException {

        ZwergenKrieger krieger = new ZwergenKrieger("Jupp", 20, 80.0);

        try(
                OutputStream dateiSchreiber = new FileOutputStream("krieger.data");
                ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
        ){
            objektSchreiber.writeObject(krieger);
            objektSchreiber.flush();
        }

    }
}
