/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Notiz
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.serialisieren;

import java.io.Serializable;

public class Notiz implements Serializable {

    /**
     * serialVersionUID kannst du dir auch mit Eclipse generieren lassen (vorausgesetzt, eine Klasse implementiert Serializable).
     * Dafür drückst du Strg+1 auf dem Klassennamen und wählst „Add generated serial version ID“ aus.
     * Die so generierte ID repräsentiert sozusagen die Klasse Notiz mit den Eigenschaften autor und nachricht in genau dieser Reihenfolge.
     */
    private static final long serialVersionUID = -5260698528552357657L;
    private String autor;
    private String nachricht;

    public Notiz(String autor, String nachricht) {
        super();
        this.autor = autor;
        this.nachricht = nachricht;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }
}
