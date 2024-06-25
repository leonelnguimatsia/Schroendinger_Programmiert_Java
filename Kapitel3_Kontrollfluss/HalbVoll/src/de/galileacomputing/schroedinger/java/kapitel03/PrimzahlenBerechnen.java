/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: PrimzahlenBerechnen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class PrimzahlenBerechnen {

    public static void main(String[] args) {

        //Betrachten alle Zahlen i von i bis 100
        for(int i = 1; i<= 100; i++){
            //Annahme: i ist Primzahl
            boolean istPrimzahl = true;
            //Betrachte alle Zahlen j von 2 bis i-1
            for(int j = 2; j<i; j++){
                //Wenn i durch j geteilt werden kann
                if(i%j == 0){
                    //i ist doch keine Primzahl
                    istPrimzahl = false;
                    //und die Teilersuche kann abgebrochen werden.
                    break;
                }
            }
            if(istPrimzahl){
                System.out.println(i);
            }
        }
    }
}
