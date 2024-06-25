/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Firma
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;

public class Firma  implements Location {

    private String name;

    public Firma(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object object){

        if(object instanceof Firma){
            Firma firma = (Firma) object;
            return this.getName().equals(firma.getName());
        }
        return false;
    }

    public String getName(){

        return name;
    }
}
