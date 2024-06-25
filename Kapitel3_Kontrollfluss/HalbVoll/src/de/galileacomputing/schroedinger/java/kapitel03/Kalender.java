/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Kalender
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel03;

public class Kalender {

    public static void main(String[] args) {

        /** Aufgabestellung:
         * Schreibe ein Programm, das für einen Monat den Kalender ausgibt.
         * Für einen Monat mit Tagen zum Beispiel, der an einem Mittwoch beginnt,
         * soll das Programm folgende Ausgabe liefern:
         */

        int monat = 6;
        int startTag = 2;
        // wenn Eingabe ein erlaubter Monat ist und der Starttag ein erlaubter Starttag ist
        if(monat >= 0 && monat <= 11 && startTag >= 0 && startTag <= 6) {
            // bestimme die Anzahl der Tage in diesem Monat
            int tage;
            switch(monat) {
                // Ist es ein Monat mit 31 Tagen?
                case 0: case 2: case 4: case 6: case 7: case 8: case 11:
                    tage = 31;
                    break;
                // Ist es der Februar?
                case 1:
                    tage = 28;
                    break;
                // Ist es ein Monat mit 30 Tagen?
                default:
                    tage = 30;
            }
            System.out.println("|MO|DI|MI|DO|FR|SA|SO|");
            int wochen = (tage + startTag) > 27 ? 5 : 4;
            // für alle Wochen
            for(int woche=1; woche<=wochen; woche++) {
                // gebe die Woche aus
                // für alle Tage
                for(int tag=1; tag<=7; tag++) {
                    // gebe den Tag aus
                    int datum = tag+(woche-1)*7-startTag;
                    if(datum > 0 && datum <= tage) {
                        System.out.print("|" + ((datum < 10) ? " " : "") + datum);
                    } else {
                        System.out.print("|  ");
                    }
                }
                System.out.println("|");
            }
        }
    }
}
