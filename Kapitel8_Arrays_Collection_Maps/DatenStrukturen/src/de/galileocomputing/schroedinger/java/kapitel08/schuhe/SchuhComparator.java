/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhComparator
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Comparator;

/**
 * - Das Comparable-Interface ist ein sogenanntes typisiertes Interface, den Typ gibst du in den spitzen Klammern an,
 * Stichwort: Generics
 */
public class SchuhComparator implements Comparator< SchuhPaar> {

    /**
     * - Wir vergleichen unsere Schuhe mit anderen Schuhen. Anders als bei der equals()- Methode, die immer ein Object als
     * Parameter bekommt, kommt hier direkt ein SchuhPaar als Parameter. Übrigens deshalb, weil du unter *1 SchuhPaar als
     * Typ angegeben hast.
     * @param schuhe1 the first object to be compared.
     * @param schuhe2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(SchuhPaar schuhe1, SchuhPaar schuhe2) {

        int result = 0;
        if(schuhe1 == null || schuhe2 == null) {
            return result;
        }

        /**
         * - Zunächst vergleichen wir die Schuhgröße. Hierbei bedienen wir uns der compareTo()-Metho￾de, die die Integer-Klasse
         * bereits implementiert.
         * - Anschließend machen wir das Gleiche für die Schuhfarbe. Zum Glück bietet die String-Klasse ebenfalls bereits eine
         * Implementierung der compareTo()-Methode an.  Und dann noch das Gleiche für die Boolesche Angabe, ob die Schuhe
         * Stöckel haben.
         */
        int groessenVergleich = Integer.valueOf(schuhe1.getGroesse()).compareTo(schuhe2.getGroesse());
        int farbenVergleich = schuhe1.getFarbe().compareTo(schuhe2.getFarbe());
        int stoeckelVergleich = Boolean.valueOf(schuhe1.isMitStoeckel()).compareTo(schuhe2.isMitStoeckel());

        /**
         * - Wenn die Schuhgrößen unterschiedlich sind, liefern wir das Ergebnis des Schuhgrößen￾vergleichs zurück,
         * - ansonsten, wenn die Schuhfar￾ben unterschiedlich sind, liefern wir das Ergebnis des Schuhfarben￾vergleichs zurück,
         * - ansonsten, wenn sich die Schuhe in ihren Stöckeln unterscheiden, liefern wir das Ergebnis des Stöckelvergleichs
         * zurück.
         */
        if(farbenVergleich != 0) {
            result = farbenVergleich;
        } else if(groessenVergleich != 0) {
            result = groessenVergleich;
        } else if(stoeckelVergleich != 0) {
            result = stoeckelVergleich;
        }
        return result;
    }

}
