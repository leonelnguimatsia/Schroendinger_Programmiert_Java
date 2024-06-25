/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchleifeAbbrechenBreak
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class SchleifeAbbrechenBreak {

    public static void main(String[] args) {

        /**
         * Mit "break" kann man die gesamte Ausführung der Schleife abbrechen.
         */
        int suchZahl = 5;
        for(int i = 0; i<args.length; i++){

            int zahl = Integer.parseInt(args[i]);

            if(zahl == suchZahl){
                System.out.println(suchZahl+ " gefunden an der Stelle "+(i+1));
                break;
            }
        }
    }
}
