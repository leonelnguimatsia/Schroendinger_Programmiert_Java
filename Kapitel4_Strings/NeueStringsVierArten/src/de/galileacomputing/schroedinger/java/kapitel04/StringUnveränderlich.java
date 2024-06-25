/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringUnveränderlich
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringUnveränderlich {

    public static void main(String[] args) {

        String schachFigur = "Läufer";
        String jemandDerLaeuft = "Läufer";
        System.out.println("1. Vergleich von schachFigur == jemandDerLaeuft: "+(schachFigur == jemandDerLaeuft));
        schachFigur.replace("Läufer","König");
        System.out.println("1. Neue Inhalt von SchachFigur: "+schachFigur);
        System.out.println("1. Inhalt von jemandDerLaeuft: "+ jemandDerLaeuft);
        System.out.println("2. Vergleich von schachFigur == jemandDerLaeuft: "+(schachFigur == jemandDerLaeuft));
        schachFigur = schachFigur.replace("Läufer","König");
        System.out.println("2. Neue Inhalt von SchachFigur: "+schachFigur);
        System.out.println("3. Vergleich von schachFigur == jemandDerLaeuft: "+(schachFigur == jemandDerLaeuft));


    }
}
