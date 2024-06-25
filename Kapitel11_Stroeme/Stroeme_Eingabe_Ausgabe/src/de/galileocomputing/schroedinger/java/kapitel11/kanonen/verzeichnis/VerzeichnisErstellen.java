/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: VerzeichnisErstellen
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.kanonen.verzeichnis;

import java.io.File;
import java.io.IOException;

public class VerzeichnisErstellen {

    public static void main(String[] args) {

        /**
         * - Hier steht die Datei, die angelegt werden soll.
         * - Erst holst du dir über getParentFile() das Verzeichnis, in dem die Datei liegt.
         * - Wenn die Datei wirklich in einem Verzeichnis liegt (und nicht direkt auf oberster Ebene), dann prüfst du mit exists(),
         * ob das Verzeichnis schon existiert.
         * - Wenn nicht, legst du es mit mkdirs() an und anschließend erstellst du die Datei.
         */
        try{
            File datei = new File("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bossingen\\ausgabe\\kundendaten.csv");
            File verzeichnis = datei.getParentFile();
            if(verzeichnis != null){
                if(!verzeichnis.exists()){
                    verzeichnis.mkdirs();
                }
                datei.createNewFile();
            }
        } catch (IOException e) {

        }
    }
}
