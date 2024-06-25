/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Abo
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.objektorientiert;

public class Abo {

    private Abonnent abonnent;

    public Abo(Abonnent abonnent){
        System.out.println("Neues Abo");
        this.abonnent = abonnent;
    }

    public double getPreisProJahr(){

        return 20.0;
    }

    public Abonnent getAbonnent() {
        return abonnent;
    }

    public double getPreisInklusivRabatt(){

        return this.getPreisProJahr();
    }
}
