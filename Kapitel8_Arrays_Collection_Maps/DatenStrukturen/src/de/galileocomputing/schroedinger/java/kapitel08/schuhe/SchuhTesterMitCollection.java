/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: SchuhTesterMitCollection
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel08.schuhe;

import java.util.Collection;
import java.util.Collections;

public class SchuhTesterMitCollection implements SolcheSchuheHastDuSchonTester {

    private Collection<SchuhPaar> schuhKollektion;

    //Den Konstruktor definieren wir so, dass er eine Collection als Parameter bekommt.
    public SchuhTesterMitCollection(Collection<SchuhPaar> schuhKollektion) {

        this.schuhKollektion = schuhKollektion;
    }

    /**
     * - Noch eine neue Methode, welche die Schuhekollektion zurückgibt (wegen der @Override Annotation zwingt dich der Compiler auch dazu,
     * diese im SolcheSchuheHastDuSchonTester-Interface anzugeben, aber ich denke, das dürfte jetzt kein Problem mehr für dich darstellen).
     * - Wir wollen ja nicht, dass jemand Schuhe hinzufügen kann, ohne die add()-Methode zu verwenden. Deswegen solltest du hier
     * eine Kopie der Collection zurückgeben, der man keine Elemente hinzufügen kann.
     * @return shuheKollektion
     */
    @Override
    public Collection<SchuhPaar> getSchuhKollektion() {

        return Collections.unmodifiableCollection(schuhKollektion);
    }

    /**
     * - Hier rufen wir einfach die add()-Methode unserer Collection auf und fügen ein neues Paar Schuhe hinzu.
     * Kein Rumhampeln mit Array-Indizes.
     * @param schuhPaar
     */
    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar) {
        this.schuhKollektion.add(schuhPaar);
    }


    /**
     * Auch für den Test, ob schon Schuhe in der Schuhkollektion drin sind, bedienen wir uns einer der Collections-Methoden,
     * nämlich contains(). Das funktioniert übrigens nur, weil unsere Schuhe bereits die equals()-Methode implementieren.
     * @param schuhPaar
     * @return
     */
    @Override
    public boolean hastDuSchon(SchuhPaar schuhPaar) {
        return this.getSchuhKollektion().contains(schuhPaar);
    }
}
