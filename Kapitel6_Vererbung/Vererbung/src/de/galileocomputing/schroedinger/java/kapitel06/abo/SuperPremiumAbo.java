/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SuperPremiumAbo
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.abo;

public class SuperPremiumAbo extends PremiumAbo {

    public SuperPremiumAbo(){

        System.out.println("Neues Super-Premium-Abo");
    }

    @Override
    public double getPreisProJahr(){

        return super.getPreisProJahr() * 2;
    }
}
