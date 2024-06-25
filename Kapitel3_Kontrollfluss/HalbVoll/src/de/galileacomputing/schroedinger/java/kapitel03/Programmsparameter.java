/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Programmsparameter
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class Programmsparameter {

    public static void main(String[] args) {

        /**
         * Schreibe ein Programm, das als Programmparameter eine Zahl erwartet
         * und ausgibt, ob sie durch 7 teilbar ist. Gib einen Fehler aus, falls
         * kein Parameter übergeben wurde.
         */
         if(args.length > 0){   //prüft, ob Standardparameter übergeben wurde
             String parameter = args[0];
             int zahl = Integer.parseInt(parameter);
             if(zahl % 7 == 0){
                 System.out.println("Glück gehabt!");
             }else{
                 System.out.println("Pech gehabt!");
             }
         }else{
             System.err.println("Keine Zahl übergeben.");
         }
    }
}
