/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Proberaum
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel06.musik;

public class Proberaum {

    public static void main(String[] args) {

        Saenger saenger = new Saenger();
        Gitarrist gitarrist = new Gitarrist();
        Bassist bassist = new Bassist();
        Trompeter trompeter = new Trompeter();
        BackgroundSaengerin backgroundsaengerin = new BackgroundSaengerin();
        machtMusik(saenger,gitarrist,bassist,trompeter,backgroundsaengerin);

    }

    public static void machtMusik(Musiker... gruppe){

        /**
         *  Hier wird per foreach-Schleife über alle Musiker iteriert und die jeweilige musizieren()-Methode aufgerufen.
         */
        for(Musiker musiker : gruppe ){
            musiker.musizieren();
        }
    }
}
