/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZweiDimensional
 *
 ********************************************************************************/
/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: ZweiDimensional
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.mehrdimensionale.array.zweidimensionale;

public class ZweiDimensional {

    public static void main(String[] args) {

        int [][] beispiel = new int [10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                beispiel[i][j] = i;
                System.out.print(" "+beispiel[i][j]+ " " );
            }
            System.out.println();
        }
    }
}
