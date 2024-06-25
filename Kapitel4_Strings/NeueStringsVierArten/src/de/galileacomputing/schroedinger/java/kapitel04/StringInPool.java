/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringInPool
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringInPool {

    public static void main(String[] args) {

        String schachFigur = "Läufer";
        String teppich = new String("Läufer");
        String jemandDerVielLaeuft = teppich.intern();
        System.out.println("schachFigur==teppich: "+(schachFigur==teppich));
        System.out.println("schachFigur==jemandDerVielLaeuft: "+(schachFigur==jemandDerVielLaeuft));
        System.out.println("teppich==jemandDerVielLaeuft: "+(teppich==jemandDerVielLaeuft));
    }
}
