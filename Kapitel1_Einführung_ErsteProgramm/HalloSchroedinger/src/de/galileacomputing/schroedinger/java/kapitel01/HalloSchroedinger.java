/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: HalloSchroedinger
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

import java.io.IOException;

public class HalloSchroedinger{

    public static void main(String[] args) throws IOException {

        System.out.println("Hallo "+args[0]);
        System.out.println("Gib einen Wert ein: ");
        int wert = System.in.read();
        System.out.println(wert);

    }
}