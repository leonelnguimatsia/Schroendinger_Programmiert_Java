/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Teststacktrace
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

public class Teststacktrace {

    public static void main(String[] args) {

        Person schroedinger = new Person();
        Person schroedingerFreundin = new Person();
        schroedingerFreundin.setWohnung(new Wohnung());
        Katze katze = new Katze(schroedingerFreundin);
        schroedingerFreundin.haushaltMachen();
    }

}
