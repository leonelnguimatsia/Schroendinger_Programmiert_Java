/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NussKopfDeserialisieren
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class NussKopfDeserialisieren {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(
                InputStream dateiLeser = new FileInputStream("irgendwas.data");
                ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
        ) {
            NussKopf gelesenesIrgendwas = (NussKopf) objektLeser.readObject();
            System.out.println(gelesenesIrgendwas.getKopf());
            System.out.println(gelesenesIrgendwas.isNuss());
        }


    }
}
