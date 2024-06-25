/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: UnveraenderteList
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.list;

import java.util.List;

public class UnveraenderteList {

    public static void main(String[] args) {

        /**
         * - Seit Java 9 gibt es übrigens auch die Methode List.to(), mit der du ebenfalls relativ einfach neue Listen erzeugen kannst.
         * - Allerdings musst du beachten, dass die Listen, die auf diese Weise erzeugt werden, immutable sind, also unveränderlich.
         * Mit anderen Worten: Du kannst solchen Listen später keine weiteren Elemente hinzu￾fügen oder welche daraus entfernen
         */
        List<String> monate2 = List.of(
                "Januar",
                "Februar",
                "März",
                "April"
        );

        System.out.println(monate2);
    }
}
