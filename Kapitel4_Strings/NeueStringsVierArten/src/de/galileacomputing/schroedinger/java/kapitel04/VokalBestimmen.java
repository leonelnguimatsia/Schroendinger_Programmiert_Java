/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: VokalBestimmen
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

import java.util.Arrays;

public class VokalBestimmen {

    public static void main(String[] args) {

        String meinString = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
        meinString = meinString.toLowerCase();

        System.out.println(meinString);

        for(int i = 0; i< meinString.length(); i++){

            char vokal = meinString.charAt(i);

            switch (vokal){
                case 'a':
                    System.out.print("-");
                    break;
                case 'o':
                    System.out.print("-");
                    break;
                case 'u':
                    System.out.print("-");
                    break;
                case 'i':
                    System.out.print("-");
                    break;
                case 'e':
                    System.out.print("-");
                    break;
                case 'y':
                    System.out.print("-");
                    break;
                default:
                    System.out.print(".");

            }
        }
    }
}
