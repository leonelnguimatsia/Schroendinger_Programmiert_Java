/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: LinkUndListig
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.ArrayList;
import java.util.List;

public class LinkUndListig {

    public static void main(String[] args) {

        /**
         *
         */
        List<String> aufgaben = new ArrayList<>();
        aufgaben.add("Geschirr spülen");
        aufgaben.add("Wohnzimmer aufräumen");
        aufgaben.add("Staub wischen");
        aufgaben.add("Badezimmer putzen");
        for(int i = aufgaben.size() - 1; i >= 0; i--) {
            System.out.println(aufgaben.remove(i));
            System.out.println(aufgaben);
        }
        //System.out.println(aufgaben);
        System.out.println(aufgaben.size());

        /*while(!aufgaben.isEmpty()) {
            //System.out.println(aufgaben.remove(0));
            //aufgaben.remove(0);
        }*/

    }
}
