/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bediengungsoperator
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class Schulnoten {

    public static void main(String[] args) {

        int note = Integer.parseInt(args[0]);
        switch (note){

            case 1:
                System.out.println("Sehr gut!"); break;
            case 2:
                System.out.println("gut!"); break;
            case 3:
                System.out.println("befriedigend!"); break;
            case 4:
                System.out.println("ausrreichend!"); break;
            case 5:
                System.out.println("mangelhaft!"); break;
            case 6:
                System.out.println("ungenügend!"); break;
            default:
                System.out.println("Ungültige Wert!");
        }
    }
}
