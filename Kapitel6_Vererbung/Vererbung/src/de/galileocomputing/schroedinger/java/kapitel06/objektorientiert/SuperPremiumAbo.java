/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SuperPremiumAbo
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.objektorientiert;

public class SuperPremiumAbo extends PremiumAbo {

    public SuperPremiumAbo(Abonnent abonnent){
        super(abonnent);
        System.out.println("Neues Super-Premium-Abo");
    }

    @Override
    public double getPreisProJahr(){

        return super.getPreisProJahr() * 2;
    }

    @Override
    public double getPreisInklusivRabatt(){

        if(this.getAbonnent().getAlter() < 18) {

            return this.getPreisProJahr() * 0.5;
        } else {
            return this.getPreisProJahr();
        }

    }
}
