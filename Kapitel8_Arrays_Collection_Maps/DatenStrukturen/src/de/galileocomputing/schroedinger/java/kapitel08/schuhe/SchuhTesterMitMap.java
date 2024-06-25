/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhTesterMitMap
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;


import java.util.Collection;
import java.util.Map;

/**
 * Angenommen, du willst zählen, wie viele Exemplare eines Schuhtyps deine Freundin hat. Wie würdest du
 * das machen?
 */
public class SchuhTesterMitMap extends SchuhTesterMitCollection implements SovieleSchuheHastDuSchonTester{

    private Map<SchuhPaar,Integer> schuhMappe;

    /**
     * - Die Schuhe werden auf die Anzahl „gemappt“, repräsentiert durch einen Integer.
     * - Der Konstruktor bekommt jetzt neben einer Collection noch eine Map, und die Collection wird an den Elternkonstruktor
     * weitergeleitet, alles nicht besonders spannend.
     * @param schuhKollektion
     * @param schuhMappe
     */
    public SchuhTesterMitMap(Collection<SchuhPaar> schuhKollektion, Map<SchuhPaar, Integer> schuhMappe) {
        super(schuhKollektion);
        this.schuhMappe = schuhMappe;
    }

    /**
     * - wichtig nur, dass du nicht vergisst, addSchuhPaar() auch in der Elternklasse aufzurufen, sonst kommt das Schuhpaar nicht
     * in die Schuhkollektion.
     * - Fehlt nur noch die Stelle, an der die Anzahl in die Map gepackt wird. Das passiert in der überschriebenen Methode addSchuhPaar(),
     * @param schuhPaar
     */
    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar){
        super.addSchuhPaar(schuhPaar);
        Integer anzahlGleicherSchuhe = this.sovieleHastDuSchon(schuhPaar);
        this.schuhMappe.put(schuhPaar, anzahlGleicherSchuhe + 1);
    }

    /**
     * - Hier dann die Implementierung der neuen Methode: Du holst einfach die Anzahl aus der Map.
     * Weil SchuhPaar bereits die Methoden equals(), hashCode() und compareTo() implementiert,
     * können wir Objekte dieser Klasse auch direkt als Schlüssel für HashMap und TreeMap verwenden.
     * @param schuhPaar
     * @return
     */
    @Override
    public int sovieleHastDuSchon(SchuhPaar neueSchuhe) {

        Integer anzahl = this.schuhMappe.get(neueSchuhe);
        return anzahl == null ? 0 : anzahl;
    }
}
