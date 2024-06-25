/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BossingensEinweihungsParty
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.erste.exception;

public class BossingensEinweihungsParty implements de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Party {

    private de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Location location;

    /**
     * - Über throws sagst du, dass diese Methode eine Exception werfen könnte.
     * - Nach dem throws kommt dann der Klassen￾name der Exception.
     *
     * @param location
     */
    @Override
    public void setLocation(de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Location location) {

        this.location = location;
    }

    /**
     * - Personen, die nicht dort arbeiten, wo die Party stattfindet, sind nicht eingeladen. Und für die gibt’s eine Exception
     * - Wirfst du eine Exception, wird der anschließende Code in der Methode nicht mehr ausgeführt
     * @param person
     * @throws NichtEingeladenerTeilnehmerException
     */
    @Override
    public void teilnehmen(de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Person person) throws de.galileocomputing.schroedinger.java.kapitel09.erste.exception.NichtEingeladenerTeilnehmerException {

        if(!person.getArbeitetBei().equals(this.getLocation())){

            throw new de.galileocomputing.schroedinger.java.kapitel09.erste.exception.NichtEingeladenerTeilnehmerException();
        }

    }


    public de.galileocomputing.schroedinger.java.kapitel09.erste.exception.Location getLocation() {
        return location;
    }
}
