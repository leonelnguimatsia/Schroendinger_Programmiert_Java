/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: AboPreisBerechner
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.serviceorientiert;

public class AboPreisBerechner {

    public double brechnePreisInklusivRabatt(Abo abo){

        double preisInklusivRabatt = 0.0;
        if(abo instanceof SuperPremiumAbo){
            if(abo.getAbonnent().getAlter() < 18){

                preisInklusivRabatt = abo.getPreisProJahr() * 0.5;

            } else if (abo instanceof PremiumAbo) {

                if(abo.getAbonnent().getAlter() < 18){

                    preisInklusivRabatt = abo.getPreisProJahr() * 0.75;
                }else{

                    preisInklusivRabatt = abo.getPreisProJahr();
                }

            }
        }

        return preisInklusivRabatt;
    }
}
