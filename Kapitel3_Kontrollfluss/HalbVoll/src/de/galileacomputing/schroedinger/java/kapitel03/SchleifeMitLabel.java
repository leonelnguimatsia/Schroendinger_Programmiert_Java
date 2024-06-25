/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchleifeMitLabel
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class SchleifeMitLabel {

    public static void main(String[] args) {

        /**
         * Mit "Label" kann man innerhalb der inneren Schleife zur äußeren Schleife zurückspringen
         * "Labels" sind Sprungmarken innerhalb deines Codes.
         * "Continue beispielmarke" bewirkt einen Sprung zur Sprungmarke.
         */
        aussen:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "," + j);
                if(i == 5){
                    continue;
                }else{
                    continue aussen;
                }

            }

        }
    }
}
