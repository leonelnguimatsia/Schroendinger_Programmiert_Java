/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HalbVoll
 *
 ********************************************************************************/


package de.galileacomputing.schroedinger.java.kapitel03;

public class HalbVoll {
    public static void main(String[] args) {

        int fuellhoeheInML = 125;

        if(fuellhoeheInML == 250){
            System.out.println("Das Glas ist voll.");
        }else if(fuellhoeheInML < 250){
            System.out.println("Das Glas ist nicht mehr voll.");
        }else if(fuellhoeheInML == 125){
            System.out.println("Das Glas ist halb voll");
        }

    }
}