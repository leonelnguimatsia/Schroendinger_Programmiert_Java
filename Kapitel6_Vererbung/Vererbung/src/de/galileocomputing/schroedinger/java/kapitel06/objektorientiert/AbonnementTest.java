package de.galileocomputing.schroedinger.java.kapitel06.objektorientiert;

public class AbonnementTest {

    public static void main(String[] args) {

        Abonnent person = new Abonnent(22);
        // einzelnen Abo und kann auch direkt über die allgemeinere Klasse "SuperPremiumAbo" referenzieren.
        Abo abo = new SuperPremiumAbo(person);
        AboPreisBerechner aboPreisBerechner = new AboPreisBerechner();
        System.out.println(aboPreisBerechner.brechnePreisInklusivRabatt(abo));
    }
}
