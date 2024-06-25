/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Person
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;

public class Person {

    private Firma arbeitetBei;
    private String name;
    private  double gehalt;

    public Person(String name, Firma arbeitetBei, double gehalt){
        super();
        this.name = name;
        this.arbeitetBei = arbeitetBei;
        this.gehalt = gehalt;
    }

    public Firma getArbeitetBei() {

        return arbeitetBei;
    }

    public String getName() {
        return name;
    }

    public double getGehalt() {
        return gehalt;
    }
}
