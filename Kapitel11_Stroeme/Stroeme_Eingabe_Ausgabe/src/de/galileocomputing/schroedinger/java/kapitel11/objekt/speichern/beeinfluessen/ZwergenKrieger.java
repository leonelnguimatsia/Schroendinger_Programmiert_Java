/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZwergenKrieger
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.beeinfluessen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * - ZwergenKrieger erweitert eine nicht serialisierbare Klasse und implementiert aber selbst das Interface
 * Serializable.
 */
public class ZwergenKrieger extends Krieger implements Serializable {

    private static final long serialVersionUID = 1129788795256789713L;

    private double groesse;

    public ZwergenKrieger(String name, int erfahrung, double groesse) {
        super(name, erfahrung);
        this.groesse = groesse;
    }

    /**
     * - writeObject() und readObject() bekommen als Parameter einen ObjectOutputStream bzw. einen ObjectInputStream.
     * Über diese Streams kannst du die Serialisierung und Deserialisierung selbst beeinflussen.
     * - defaultWriteObject() und defaultReadObject() diese Stream-Klasse sorgen dafür, dass die serialisierbaren direkten Datenfelder der
     * aktuellen Klasse (also von ZwergenKrieger) über die Standardserialisierung serialisiert werden sollen
     * - Auf den Streams lässt sich dank writeObject() Objektreferenzen, wie zum Beispiel Stringvariablen, serialisieren
     * - außerdem gibt es noch äquivalente Methoden für die primitiven Datentypen, writeInt(), readInt(), writeBoolean(), readBoolean()
     * und so weiter. Damit kannst du beliebige Werte speichern, auch die der Superklasse
     * @param out
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.getName());
        out.writeInt(this.getErfahrung());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.setName((String) in.readObject());
        this.setErfahrung(in.readInt());
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

}
