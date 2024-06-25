/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhPaar
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

/**
 * - Das Comparable-Interface ist ein sogenanntes typisiertes Interface, den Typ gibst du in den spitzen Klammern an,
 * Stichwort: Generics
 */
public class SchuhPaar implements Comparable<SchuhPaar>{

    private String farbe;
    private int groesse;
    private boolean mitStoeckel;

    public SchuhPaar(String farbe, int groesse, boolean mitStoeckel) {
        this.farbe = farbe;
        this.groesse = groesse;
        this.mitStoeckel = mitStoeckel;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public boolean isMitStoeckel() {
        return mitStoeckel;
    }

    public void setMitStoeckel(boolean mitStoeckel) {
        this.mitStoeckel = mitStoeckel;
    }

    @Override
    public String toString() {

            return "SchuhPaar : "+"\n"+
                    "- Farbe = "+ this.getFarbe()+ "\n"+
                    "- Groesse = "+ this.getGroesse() + "\n"+
                    "- MitStoeckel = "+ (this.isMitStoeckel() ? " mit Stöckeln" : " ohne Stöckel");

    }

    /**
     * - Der Parameter für die equals()-Methode ist immer Object, nicht etwa –wie man meinen könnte –SchuhPaar.
     * Ganz wichtig, denn sonst überschreibst du nicht, wie geplant, sondern überlädst die Methode nur
     * - Anhand der @Override￾ Annotation erkennt der Compiler, dass du überschreiben möchtest. Würdest du statt Object die Klasse SchuhPaar
     * in der Methodendeklaration verwenden, würde der Compiler aufschreien. Anhand der @Override￾Annotation erkennt der Compiler,
     * dass du überschreiben möchtest. Würdest du statt Object die Klasse SchuhPaar in der Methodendeklaration verwenden, würde der Compiler aufschreien.
     * - Die Farbe ist als String implementiert, und die Klasse String hat eine eigene equals()-Methode, die bereits korrekt funktioniert.
     * Die kannst du ruhigen Gewissens verwenden.
     * - Die Schuhgröße und die Angabe, ob die Schuhe Stöckel haben, sind beides primitive Datentypen, und die werden nach wie vor mit dem
     * ==-Operator verglichen. Nur wenn alle drei Eigenschaften gleich sind, ist gleich true.
     * @param object
     * @return true
     */
    @Override
    public boolean equals(Object object){
        boolean gleich = false;
        if(object != null && object instanceof SchuhPaar) {
            SchuhPaar schuhPaar = (SchuhPaar) object;
            gleich = schuhPaar.getFarbe().equals(this.getFarbe())
                    && schuhPaar.getGroesse() == this.getGroesse()
                    && schuhPaar.isMitStoeckel() == this.isMitStoeckel();
        }
        return gleich;
    }

    /**
     * - HashSets sind sehr performant und wesentlicher schneller, als wenn du alle Schuhpaare vergleichen müsstest.
     * - Jetzt brauchen wir nur noch die Stelle, an der diese eindeutige Nummer bzw. dieser eindeutige Code erzeugt wird.
     * Das passiert in der Methode hashCode().
     * - Die hashCode()-Methode kann ruhig so imple￾mentiert sein, dass ungleiche Objekte gleiche Hashcodes bekommen. Das ist nicht schlimm.
     * In unserem Schuhschrank-Beispiel sind ja auch gelbe High Heels in 38 zusammen mit rosa High Heels in 38 in einem Schrank.
     *
     * @return
     */
    @Override
    public int hashCode(){

        return this.getGroesse() + Boolean.hashCode(this.isMitStoeckel());
    }

    /**
     *
     */
    @Override
    public int compareTo(SchuhPaar schuhe) {

        int result = 0;

        if(schuhe == null) {
            return result;
        }

        /**
         * - Zunächst vergleichen wir die Schuhgröße. Hierbei bedienen wir uns der compareTo()-Metho￾de, die die Integer-Klasse
         * bereits implementiert.
         * - Anschließend machen wir das Gleiche für die Schuhfarbe. Zum Glück bietet die String-Klasse ebenfalls bereits eine
         * Implementierung der compareTo()-Methode an.  Und dann noch das Gleiche für die Boolesche Angabe, ob die Schuhe
         * Stöckel haben.
         */
        int groessenVergleich = Integer.valueOf(this.getGroesse()).compareTo(schuhe.getGroesse());
        int farbenVergleich = this.getFarbe().compareTo(schuhe.getFarbe());
        int stoeckelVergleich = Boolean.valueOf(this.isMitStoeckel()).compareTo(schuhe.isMitStoeckel());

        /**
         * - Wenn die Schuhgrößen unterschiedlich sind, liefern wir das Ergebnis des Schuhgrößen￾vergleichs zurück,
         * - ansonsten, wenn die Schuhfar￾ben unterschiedlich sind, liefern wir das Ergebnis des Schuhfarben￾vergleichs zurück,
         * - ansonsten, wenn sich die Schuhe in ihren Stöckeln unterscheiden, liefern wir das Ergebnis des Stöckelvergleichs
         * zurück.
         */
        if(farbenVergleich != 0) {
            result = farbenVergleich;
        } else if(groessenVergleich != 0) {
            result = groessenVergleich;
        } else if(stoeckelVergleich != 0) {
            result = stoeckelVergleich;
        }
        return result;
    }

}
