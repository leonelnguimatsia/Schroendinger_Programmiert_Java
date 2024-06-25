/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Autor
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt;

import java.io.Serializable;

public class Autor implements Serializable {

    private static final long serialVersionUID = 2655816823397736440L;

    private String vorname;

    private String name;

    public Autor(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Autor [vorname=" + vorname + ", name=" + name + "]";
    }

}
