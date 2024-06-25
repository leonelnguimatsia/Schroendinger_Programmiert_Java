/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: TschuessSager
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel05.klassenmethoden;


public class TschuessSager {

    public static void main(String[] args) {

        sagTschuess("Schrödinger");
        sagTschuess("Bossingen");

    }

    /**
     * Den Methodennamen plus die Anzahl der Parameter und deren
     * Typen nennt man auch Methodensignaturen.
     * -Statischen Methoden heißt auch "Klassenmethoden"
     * @param name
     */
    public static void sagTschuess(String name){

        if(name != null && name.startsWith("Boss")){

            System.out.println("Aufwiedersehen, herr "+name);
        }else{

            System.out.println("Tschüss "+name);
        }

    }
}