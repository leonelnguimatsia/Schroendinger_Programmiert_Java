/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringZerlegen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringZerlegen {

    public static void main(String[] args) {

        /** 1. Die Axt
         *  Die Axt zerteilt den String an einer Stelle
         */
        String gegner = "Schleimiger Riesenschneckendrachen";
        System.out.println("1. Die Axt: "+gegner.substring(18));

        /** 2. Die Doppelaxt
         *Mit der zweiten Variante von subString() machst du aus dem Riesenschneckendrachen
         * eine Schnecke.
         */
        System.out.println("2. Die Doppelaxt: "+gegner.substring(18,26));

        /** 3. Die Spaltmaschine
         *  - Die Methode heißt split(). Mit der kannst du alles Mögliche zerteilen und zerhacken:
         *  Textabschnitte in sätze, Sätze in Wörter, Telefonnummer in Vorwahl und Hauptnummer....
         *  - Ein regulärer Ausdruck ist eine spezielle Zeichenkette, mit der du andere Zeichenketten beschreiben kannst.
         *  - Der rückgabewert der split()-Methode ist ein Array von String.
         *  - Arrays.toString() ist eine Helfermethode, um das String-Array in einem String zu konvertieren.
         *  - Während du bei "substring()" einen einzelnen String als Rückgabe bekommst, liefert "split()" ein ganzes Array von String.
         */
        String frucht = "Ananas";
        String[] scheibschen = frucht.split("a");
        System.out.println("Die Ausgabe nach split ist: "+ Arrays.toString(scheibschen));

    }
}
