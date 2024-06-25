package de.galileocomputing.schroedinger.java.kapitel06.abo;

public class AbonnementTest {

    public static void main(String[] args) {

        // einzelnen Abo und kann auch direkt über die allgemeinere Klasse "SuperPremiumAbo" referenzieren.
        Abo abo = new SuperPremiumAbo();
        System.out.println("Abo: "+ abo.getPreisProJahr());
    }
}
