/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringBufferDynamischGroeßeAendern
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringBufferDynamischGroeßeAendern {

    public static void main(String[] args) {

        /**
         * Es gibt nämlich durchaus Fälle, in de denen du vorher weißt, wie groß
         * die Zeichenkette wird
         */

        int  anzahl = 5;
        String s = "Yippie ";
        StringBuilder stringBuilder = new StringBuilder(s.length() * anzahl);
        for(int i=0; i<anzahl; i++){

            stringBuilder.append(s);
        }
        System.out.println(stringBuilder.toString());
    }
}
