/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.starvation;


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
     * - Solange der jeweilige Held noch nicht fertig ist mit seinem Geschäft, wird geschlafen. Durch diese
     * Endlosschleife bekommt der andere Held also gar keine Chance.
     * @param toilette
     */
    public void malGehen(Toilette toilette) {

        System.out.printf("%s: \"Mach schon, mach schon!\"%n", this.getName());

        /**
         * - Der Zwerg versucht, toilette als Lock-Objekt zu bekommen, und schafft es auch!
         * - Der arme Nachtelf versucht ebenfalls, toilette als Lock￾Objekt zu bekommen, schafft es aber
         * nicht rechtzeitig (weil der Zwerg es ja schon hat) und muss warten und warten
         */
        synchronized (toilette) {
            System.out.printf("%s: \"Aaaaaaaahhhh, das wurde auch Zeit!\"%n", this.getName());
            while (!this.isFertig()) {
                try {
                    Thread.sleep(500);
                    System.out.printf("%s: \"Zzzzzzzz!\"%n", this.getName());
                } catch (InterruptedException exception) {
                }
            }
        }
    }

    protected boolean isFertig() {
        return false;
    }

}
