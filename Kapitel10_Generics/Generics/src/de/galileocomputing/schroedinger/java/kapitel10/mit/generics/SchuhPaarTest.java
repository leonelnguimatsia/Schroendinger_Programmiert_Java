/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhPaarTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.mit.generics;

import de.galileocomputing.schroedinger.java.kapitel10.bevor.generics.AlterKarton;

public class SchuhPaarTest {

    public static void main(String[] args) {

        //Karton für alles benutzen
        SchuhPaar schuhPaar = new SchuhPaar(38,"Schwarz",true);
        AlterKarton alterKarton = new AlterKarton(schuhPaar);

        /**
         * - Auch wenn eine SchuhPaar-Instanz drin ist, der Rückgabetyp von getInhalt() ist immer vom Typ Object.
         * - Um auf Methoden von SchuhPaar zugreifen zu können, musst du den Rückgabewert erst nach SchuhPaar casten.
         * - Aber bitte nicht ohne vorher zu prüfen, ob der Cast auch gelingen wird. Die Runtime￾Exceptions lassen grüßen
         */
        Object inhalt = alterKarton.getInhalt();
        if(inhalt instanceof SchuhPaar){
            SchuhPaar schuheAusKarton = (SchuhPaar)inhalt;
            System.out.println(schuheAusKarton.getFarbe());
        }
    }
}
