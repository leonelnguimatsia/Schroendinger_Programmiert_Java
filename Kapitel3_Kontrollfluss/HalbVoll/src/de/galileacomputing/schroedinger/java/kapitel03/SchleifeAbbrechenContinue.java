/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchleifeAbbrechenContinue
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class SchleifeAbbrechenContinue {

    public static void main(String[] args) {

        /**
         * Mit "Continue" kann man die aktuelle Schleifeniteration abbrechen
         */
        int suchZahl = 5;
        for (int i = 0; i < args.length; i++) {

            int zahl = Integer.parseInt(args[i]);

            if(zahl%suchZahl !=0){
                System.out.println(zahl+ " nicht teilbar durch "+ suchZahl);
                continue;
            }

            if(zahl == suchZahl){
                System.out.println(suchZahl+ " gefunden an Stelle "+(i+1));
                break;
            }

        }
    }
}
