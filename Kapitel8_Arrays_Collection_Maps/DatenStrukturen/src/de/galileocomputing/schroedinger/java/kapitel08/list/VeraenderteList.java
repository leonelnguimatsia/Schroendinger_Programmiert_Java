/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: VeraenderteList
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.list;

import java.util.ArrayList;
import java.util.List;

public class VeraenderteList {

    public static void main(String[] args) {

        /**
         * - So erstellst du eine Liste. Links das Interface, rechts die Implementierung. Die Angabe in den spitzen Klammern gibt
         * den Typ an, den Elemente haben müssen, wenn sie in die Gruppe wollen. In der Realität nennt man sowas Gruppenzwang,
         * in Java nennt man das Generics. Generics erhöhen die Typsicherheit beim Programmieren. Eben bei den Arrays hast
         * du gesehen, dass du Probleme bekommst, wenn du Hunde und Katzen gemeinsam in ein Array packst und diese Probleme erst zur Laufzeit
         * erkennst. Mit Generics kann der Compiler dich bereits zur Compilezeit vor sowas warnen. Mehr Details dazu gibt’s in Kapitel 10.
         * - Seit Java 7 kann die Angabe des Typs auf der rechten Seite der Zuweisung wegfallen. Davor musste man in den spitzen Klammern
         * auch den Typ angeben.
         */
        List<String> monate = new ArrayList<String>();
        List<String> monate2 = new ArrayList<>();

        //Ein paar Elemente hinzufügen
        monate.add("Januar");
        monate.add("Februar");
        monate.add("März");
        monate.add("April");

        /**
         * Über get() bekommst du die Elemente in der Liste. Und da wir bei der Deklaration der Liste angegeben haben, dass
         * nur Strings in der Liste sind, bekommen wir hier auch direkt einen String zurück. Hätten wir das nicht getan, das heißt, hätten wir
         * keine Generics verwendet, müssten wir hier umständlich den Typ prüfen und casten. Noch ein weiterer Unterschied zwischen
         * Collections und Arrays: Arrays waren schon immer typisiert, Collections erst seit Java 5
         */
        String januar = monate.get(0);

        //die Größe ausgeben: 4, wie erwartet
        System.out.println("Die Size ist: "+monate.size()+ "\nund das Monat ist: "+januar);

    }
}
