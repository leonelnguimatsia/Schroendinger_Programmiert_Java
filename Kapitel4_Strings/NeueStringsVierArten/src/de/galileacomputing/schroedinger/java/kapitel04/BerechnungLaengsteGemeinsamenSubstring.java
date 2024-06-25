/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BerechnungLaengsteGemeinsamenSubstring
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class BerechnungLaengsteGemeinsamenSubstring {

    public static void main(String[] args) {

        /**
         * Über diese geschachtelte Schleife werden alle mögliche Teilstrings von s1 gebildet, also erst alle mit
         * einem Buchstaben ("T","i","s","c","h","l","e","r","e"."i"), dann mit zwei Buchstaben ("Ti","is","sc","ch","hl","le","er","re"),
         * dann alle mit drei, mit vier, mit fünf, .....
         */
        String s1 = "Tischlerei";
        String s2 = "Fische";
        String gemeinsamerSubstring ="";

        for(int i = 0; i< s1.length(); i++){
            for(int j = 0; j< s1.length()-i; j++){
                String teilString = s1.substring(j, j+i);
                if(s2.contains(teilString)){
                    gemeinsamerSubstring = teilString;
                }

                System.out.println("Bildung von Substrig zwischen "+j+ " und "+(j+i)+ " ist: "+teilString);
            }
        }

        System.out.println();
        System.out.println("Das längste GemeinsameSubstring zwischen "+s1+ " und " +s2+" ist "+gemeinsamerSubstring);


    }
}
