/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringBufferDynamischGroeßeAendern
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringBuilderInschleifen {

    public static void main(String[] args) {

        /**
         * Niemals einen String mit +-Operator in einer Schleife zusammenfügen, verwendest du am liebstem StringBuilder
         */

       /* String text ="";
        for(int i=1; i<=99; i++){

            text += "Luftballon " + i + "\n";
        }
        System.out.println(text);*/

        StringBuilder textMitStringBuilder = new StringBuilder(13377);
        for(int i=1; i<=99; i++){

            textMitStringBuilder.append("Luftballon "+ i + "\n");
        }
        System.out.println(textMitStringBuilder.toString());
    }
}
