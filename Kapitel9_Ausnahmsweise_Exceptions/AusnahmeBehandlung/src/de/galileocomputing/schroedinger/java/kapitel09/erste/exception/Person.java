/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Person
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.erste.exception;

public class Person {

    private de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma arbeitetBei;

    public Person(de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma arbeitetBei){
        super();
        this.arbeitetBei = arbeitetBei;
    }

    public de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Firma getArbeitetBei() {

        return arbeitetBei;
    }
}
