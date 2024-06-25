/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Notiz
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.geschachtelt;

import java.io.Serializable;

public class Notiz implements Serializable {

    private static final long serialVersionUID = 6847025911291986221L;

    /**
     * - Serialisierung und Deserialisierung kann man mit dem Schlüsselwort *transient* beeinflussen.
     * - was bedeutet, dass diese Datenfelder nicht serialisiert werden sollen.
     * ZB. private transient Autor autor;
     */
    private Autor autor;
    private String nachricht;

    public Notiz(Autor autor, String nachricht) {
        super();
        this.autor = autor;
        this.nachricht = nachricht;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

}
