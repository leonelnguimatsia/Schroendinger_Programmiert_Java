/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: GeradeUngeradeTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.gerade.ungerade;

public class GeradeUngeradeTest {

    public static void main(String[] args) {

        int grenze = 100;
        (new Thread(new GeradeZahlenDrucker(grenze))).start();
        (new Thread(new UngeradeZahlenDrucker(grenze))).start();

    }
}
