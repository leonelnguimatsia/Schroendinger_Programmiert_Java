/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BigBossParty
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel09.zweite.exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class BigBossParty implements Party {

    private static final Logger log = Logger.getLogger(BigBossParty.class.getName());
    private Location location;

    static {
        try {
            Handler handler = new FileHandler("BigBossParty.log");
            log.addHandler(handler);
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


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
    public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException, BudeVollException {

        log.info("Teilnehmer: "+person.getName());
        if(!person.getArbeitetBei().equals(this.getLocation())){
            log.warning(person.getName() + " nicht eingeladen.");
            throw new NichtEingeladenerTeilnehmerException(person.getName());
        }else if(person.getGehalt() < 40000.0){
                log.warning(person.getName()+" verdient nicht genug für diese Big Boss Party.");
                throw new NichtReichGenugException(person.getName());
        }
        log.info("Teilnehmer: " + person.getName());

    }

    public Location getLocation() {
        return location;
    }
}
