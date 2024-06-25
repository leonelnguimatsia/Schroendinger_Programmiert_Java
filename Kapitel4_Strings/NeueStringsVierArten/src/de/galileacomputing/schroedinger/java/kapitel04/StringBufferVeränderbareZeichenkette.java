/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StringUnveränderlich
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class StringBufferVeränderbareZeichenkette {

    public static void main(String[] args) {


        //StringBuilder und StringBuffer erstellst du mit new. Hier darfst du das!
        StringBuilder stringBuilder = new StringBuilder();

        // Mit append() kannst du Zeichen(Oder auch primitive Datentypen oder ganze Objekte) anhängen
        stringBuilder.append("String");
        stringBuilder.append("-");
        stringBuilder.append("Bilder");

        /**
         * - Mit insert() fügst du Zeichen (oder wieder primitive Datentypen oder ganze Objekte) an einem
         * bestimmten Index ein.
         * -sowohl append() auch insert() erstellen keine neuen Objekte, sondern ändern dynamisch das darunterliegende Objekt-
         */
        stringBuilder.insert(8,"u");

        /**
         * Mit toString() wandelst du ein Objekt in einen String um.
         * Das könntest du beim Aufruf von println() auch weglassen und die Variable StringBuilder direkt übergeben,
         * weil "println()" intern die toString()-Methode von übergebene Objekten aufruft.
         */
        System.out.println(stringBuilder.toString());

    }
}
