/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Party
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;


public interface Party {

    /**
     * - Über throws sagst du, dass diese Methode eine Exception werfen könnte.
     * - Nach dem throws kommt dann der Klassen￾name der Exception.
     * @param location
     */
    void setLocation(Location location);
    void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException, BudeVollException;
}
