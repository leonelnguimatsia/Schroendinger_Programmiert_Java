/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NussKopfSerialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class NussKopfSerialisieren {

    public static void main(String[] args) throws Exception, ClassNotFoundException {

        NussKopf irgendwas= new NussKopf("das",true);

        try(
                OutputStream dateiSchreiber = new FileOutputStream("irgendwas.data");
                ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
        ) {
            objektSchreiber.writeObject(irgendwas);
            objektSchreiber.flush();
        }
    }
}
