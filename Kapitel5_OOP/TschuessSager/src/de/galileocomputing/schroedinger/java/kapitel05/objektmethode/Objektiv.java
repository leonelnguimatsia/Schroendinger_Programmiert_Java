/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Objektiv
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.objektmethode;

public class Objektiv {

    public static final int MIN_BRENNWEITE = 10;
    public  static final int MAX_BRENNWEITE = 270;


    private int brennweiteMin;
    private int brennweiteMax;


    public Objektiv(int brennweiteMin, int brennweiteMax) {

        this.setBrennweiten(brennweiteMin, brennweiteMax);
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiten(int brennweiteMin, int brennweiteMax) {

        if((brennweiteMin >= MIN_BRENNWEITE && brennweiteMin <= brennweiteMax ) && (brennweiteMin <= MAX_BRENNWEITE)){
            this.brennweiteMin = brennweiteMin;
            this.brennweiteMax = brennweiteMax;
        }else{

            System.err.println("- Die minimale Brennweite muss kleiner gleich der maximalen Brennweite sein. \n" +
                    "- oder Die maximale Brennweite muss großer gleich der minimalen Brennweite sein.\n"+
                    "- Oder minimale Brennweite ist sehr klein als 10 oder maximale Brennweite wurde überschreite (Bitte kleiner als 270).");
        }
    }
}
