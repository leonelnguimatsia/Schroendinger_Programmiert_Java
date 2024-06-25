/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: GeradeZahlenDrucker
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel12.gerade.ungerade;

public class GeradeZahlenDrucker extends AbstractZahlenDrucker {

    /**
     * Grenze gibt die Anzahl der zu druckenden Zahlen an
     *
     * @param grenze
     */
    public GeradeZahlenDrucker(int grenze) {
        super(grenze);
    }

    @Override
    protected boolean akzeptiereZahl(int zahl){

        return zahl % 2 == 0;
    }
}
