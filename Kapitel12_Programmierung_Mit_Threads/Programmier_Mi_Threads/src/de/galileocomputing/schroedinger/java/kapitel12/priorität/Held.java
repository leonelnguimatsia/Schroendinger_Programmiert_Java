/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.priorität;


/**
 * - Die Basisklasse für unsere Helden ist erstmal noch ganz simpel mit einem Datenfeld, einem Getter
 */
public abstract class Held {

    private String name;


    public Held(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void trinken() {
        System.out.printf("%s: \"Noch ein Bier, lecker.\"%n", this.getName());
    }

}
