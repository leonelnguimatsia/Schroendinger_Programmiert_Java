/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.warten.benachrichtigen;


import de.galileocomputing.schroedinger.java.kapitel12.livelock.Bier;

/**
 * - Die Basisklasse für unsere Helden ist erstmal noch ganz simpel mit einem Datenfeld, einem Getter
 */
public abstract class Held {

    private String name;

    public Held(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * - Wieder eine neue Heldenmethode. Der Parameter vom Typ Toilette ist ein ganz simples Objekt
     * ohne großartige Methoden.
     * - Dieses Objekt dient dann als Lock. Nur wer sich zuerst das Lock-Objekt sichert, darf diesen Code hier ausführen.
     * @param toilette
     */
    public void malGehen(Toilette toilette) {
        System.out.printf("%s: \"Ich als Erster, ich als Erster!\"%n", this.getName());
        synchronized (toilette) {
            System.out.printf("%s: \"Aaaaaaaahhhh, das wurde auch Zeit!\"%n", this.getName());
        }
    }
    protected boolean isFertig() {
        return false;
    }

}
