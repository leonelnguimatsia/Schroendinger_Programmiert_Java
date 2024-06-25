/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: LiegestützeSchachtelSchleife_1
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class LiegestützeSchachtelSchleife_1 {

    public static void main(String[] args) {

        /**
         * Fünf Runde mit je 50 Liegestützen
         */
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
            System.out.println(". Runde - auf geht's: ");
            for(int j = 1; j <= 50; j++){
                System.out.print(j);
                System.out.println(". Liegestütze");
            }
        }

    }
}
