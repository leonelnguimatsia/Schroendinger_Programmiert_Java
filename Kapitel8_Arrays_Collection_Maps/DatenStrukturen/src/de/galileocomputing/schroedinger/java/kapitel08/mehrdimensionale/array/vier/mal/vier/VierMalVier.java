/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: VierMalVier
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.mehrdimensionale.array.vier.mal.vier;

public class VierMalVier {

    public static void main(String[] args) {

        int[][] vierMalVier = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};

        for (int i = 0; i < vierMalVier.length; i++) {
            for (int j = 0; j < vierMalVier[i].length; j++) {

                System.out.print(vierMalVier[i][j] + " ");
            }
            System.out.println();
        }
    }
}
