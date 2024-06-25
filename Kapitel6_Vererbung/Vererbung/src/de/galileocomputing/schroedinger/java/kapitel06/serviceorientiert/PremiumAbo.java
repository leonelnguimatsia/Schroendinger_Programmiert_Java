/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Premium
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.serviceorientiert;

public class PremiumAbo extends Abo {

    public PremiumAbo(Abonnent abonnent){
        super(abonnent);
        System.out.println("Neues Premium-Abo");
    }

    @Override
    public double getPreisProJahr(){

        return super.getPreisProJahr() * 2;
    }

}
