/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: WoWTextadventureErweitert
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

import java.io.*;

public class WoWTextadventureErweitert {

    public static void main(String[] args) throws IOException {

        System.out.println();
        System.out.println("Hallo " + args[0] + ", willkommen in der World of " +
                "Warcraft. Du befindest du dich im Dorf Buxelknuxel. ");
        System.out.println("Verwende die Tasten 'N', '0', 'S', und 'W', um dich zu " +
                "bewegen, und 'I', um einen Blick in dein Inventar zu werfen. ");
        System.out.println("Mit 'Q' verlässt du das Spiel.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String befehl;
        int nordenzaehler = 0;
        while((befehl = br.readLine()) != null){
            switch (befehl.toLowerCase()){
                case "n":
                    nordenzaehler++;
                    if(nordenzaehler == 4){
                        System.out.println("Du findest einen Schatz.");
                        final int breite = 17;
                        final int haefteBreite = (breite-1)/2;
                        final int hoehe = haefteBreite;
                        final int lezteReihe = hoehe-1;
                        final int letzteSpalte = breite-1;

                        for(int i = 0; i< hoehe; i++){
                            for(int j = 0; j<breite; j++){
                                switch (i){

                                    case 0:
                                        System.out.print((j == 0 || (j == haefteBreite) || j == letzteSpalte) ? "*" : " ");
                                        break;
                                    case lezteReihe:
                                        System.out.print("8");
                                        break;
                                    default:
                                        System.out.print((j<i || (j>haefteBreite-i && j<haefteBreite+i) || j>letzteSpalte-i)?
                                                "0" : " ");
                                }
                            }
                            System.out.println();
                        }

                    }else{
                        System.out.println("Du gehst nach Norden.");
                    }
                    break;
                case  "o":
                    System.out.println("Du gehst nach Osten.");
                    break;
                case "s":
                    System.out.println("Du gehst nah Süden.");
                    break;
                case "w":
                    System.out.println("Du gehst nach Westen.");
                    break;
                case "q":
                    System.out.println("Willst du wirklick schon aufgeben? Y/N");
                    String bestaetigung = br.readLine();
                    switch (bestaetigung.toLowerCase()){
                        case "y":
                            System.out.println("Und Tschüss.");
                            System.exit(0);
                            break;
                        case "n":
                            System.out.println("Finde ich Prima.");
                            break;
                    }
                    break;
                case "":
                    System.out.println("Du willst gar nichts machen? Das glaube ich nicht.");
                    break;

                case "i":
                    System.out.println("Da du noch nicht die Weisheit der Array-kündingen" +
                            "Sammler erlangt hast, befindet sich in deinem Inventar nur ein " +
                            "einziger Gegenstand: ein Holzschwert");
                    break;
                default:
                    System.err.println("Das verstehe ich nicht.");
            }
        }
    }

}
