/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhPaar
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel10.interfaces.zweite.moeglichkeit;

public class SchuhPaar  {

    private int groesse;
    private String farbe;
    private boolean mitStoeckeln;


    public SchuhPaar(int groesse, String farbe, boolean mitStoeckeln) {

        this.groesse = groesse;
        this.farbe = farbe;
        this.mitStoeckeln = mitStoeckeln;
    }

    public int getGroesse() {
        return groesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isMitStoeckeln() {
        return mitStoeckeln;
    }


}
