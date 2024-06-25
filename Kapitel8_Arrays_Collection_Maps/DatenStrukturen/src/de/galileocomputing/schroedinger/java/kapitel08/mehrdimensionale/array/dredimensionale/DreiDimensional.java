/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: DreiDimensional
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.mehrdimensionale.array.dredimensionale;

public class DreiDimensional {

    public static void main(String[] args) {

        double[][][] dreiD = {{{5},{2},{4}},{{3},{4},{5}},{{2},{3},{4}},{{5},{6},{3}}};

        for (int i = 0; i < dreiD.length; i++) {
            for (int j = 0; j < dreiD[i].length; j++) {
                for (int k = 0; k < dreiD[i][j].length; k++) {
                    System.out.print(dreiD[i][j][k] + " ");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}
