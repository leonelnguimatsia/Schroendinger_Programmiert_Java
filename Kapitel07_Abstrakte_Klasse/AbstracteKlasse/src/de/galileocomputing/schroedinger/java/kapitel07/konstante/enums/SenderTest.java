/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SenderTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.konstante.enums;

public class SenderTest {

    public static void main(String[] args) {

        Sender sender = Sender.ARD;
        switch (sender) {
            case ARD:
                System.out.println("Tatort");
                break;
            case ZDF:
                System.out.println("Traumschiff");
                break;
            case RTL:
                System.out.println("Dschungelcamp");
                break;
            case SAT1:
                System.out.println("Glücksrad");
                break;
            default:
                break;
        }

    }
}
