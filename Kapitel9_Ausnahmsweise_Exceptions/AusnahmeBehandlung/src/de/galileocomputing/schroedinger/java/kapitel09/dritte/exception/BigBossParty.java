/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BigBossParty
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.dritte.exception;

import java.util.logging.Logger;

public class BigBossParty implements Party {

    private Location location;

    /**
     * - Über throws sagst du, dass diese Methode eine Exception werfen könnte.
     * - Nach dem throws kommt dann der Klassen￾name der Exception.
     *
     * @param location
     */
    @Override
    public void setLocation(Location location){

            this.location = location;
    }

    @Override
    public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException {

        if(!person.getArbeitetBei().equals(this.getLocation())) {
            throw new NichtEingeladenerTeilnehmerException(person.getName());
        } else if(person.getGehalt() < 40000.0) {
            throw new NichtReichGenugException(person.getName());
        } else {
            System.out.println("Willkommen " + person.getName());
        }

    }

    public Location getLocation() {

        return location;
    }
}
