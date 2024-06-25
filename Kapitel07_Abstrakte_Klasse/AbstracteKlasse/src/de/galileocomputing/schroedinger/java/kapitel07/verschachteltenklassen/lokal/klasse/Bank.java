/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Bank
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.verschachteltenklassen.lokal.klasse;

public class Bank {

    private double vermoegen = 40.0;


    public Bank(){

        final double zahl =  7;

         class Tresor {

            private void getInhalt(){

                double anderZahl = zahl + vermoegen;
            }
        }
        Tresor tresor = new Tresor();
        tresor.getInhalt();
    }

    public double getVermoegen() {

        {
            class Tresor {
                private void getInhalt() {
                    System.out.println(vermoegen);
                }
            }
            Tresor tresor = new Tresor();
            return vermoegen;
        }

    }
    //Tresor tresor = new Tresor();
}
