/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KampfAktion
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel12.fork.join;

import java.util.List;
import java.util.concurrent.RecursiveAction;

//KampfAktion leitet von der abstrakten Klasse RecursiveAction ab
public class KampfAktion extends RecursiveAction {

    private static final long serialVersionUID = -6813393357672133394L;
    private int MAX_ANZAHL_FEINDE = 6;
    private List<Feind> feinde;

    // mit etwas angepasstem Konstruktor, um die Liste der Feinde zu übergeben.
    public KampfAktion(List<Feind> feinde) {
        this.feinde = feinde;
    }

    /**
     * - compute() ist die Methode, die du überschreiben musst, und stellt quasi die Kernlogik der Aktion dar.
     */
    @Override
    protected void compute() {

        /**
         * - Und so sieht die Arbeitsteilung aus: Wenn die Anzahl der Feinde, die der Aktion zugeteilt sind,
         * kleiner ist als MAX_ANZAHL_FEINDE, dann kämpft der Held selbst
         */
        if (this.feinde.size() < MAX_ANZAHL_FEINDE) {
            kaempfeSelber();
        } else {
            //ansonsten werden die Feinde aufgeteilt, am besten gleichmäßig, und anschließend auf weitere Aktionen verteilt.
            System.out.printf("%s: \"%d Feinde, das ist mir zuviel, hilf mir einer!\"%n", Thread.currentThread().getName(), this.feinde.size());
            int mitte = this.feinde.size() / 2;
            List<Feind> eineHaelfteDerFeinde = this.feinde.subList(0, mitte);
            List<Feind> andereHaelfteDerFeinde = this.feinde.subList(mitte, this.feinde.size());
            KampfAktion kampfAktionEineHaelfteDerFeinde = new KampfAktion(eineHaelfteDerFeinde);
            KampfAktion kampfAktionAndereHaelfteDerFeinde = new KampfAktion(andereHaelfteDerFeinde);
            /**
             * fork() sorgt dafür, dass diese Aktion asynchron gestartet wird (ohne dass auf das Ergebnis gewartet wird),
             * invoke() ruft eine Aktion auf (und wartet auf das Ergebnis), und join() sorgt dafür, dass auf das Ergebnis einer
             * (bereits gestarteten) Aktion gewartet wird. Was passiert hier also genau? Erst wird die Aktion für die eine Hälfte der Feinde
             * gestartet (fork()), anschließend die Aktion für die andere Hälfte, auf die dann auch gewartet wird (invoke()), und
             * zum Schluss wird dann noch auf die Fertigstellung der mit fork() begonnenen Aktion gewartet (join()).
             * - P. S.: Formatierungen gucken wir uns, wie du weißt, später an, nur so viel: %d bedeutet, dass der entsprechende
             * Parameter (in diesem Fall this.feinde.size()) als Dezimalzahl interpretiert und in den String an dieser Stelle
             * eingefügt werden soll.
             */
            kampfAktionEineHaelfteDerFeinde.fork();
            kampfAktionAndereHaelfteDerFeinde.invoke();
            kampfAktionEineHaelfteDerFeinde.join();
			invokeAll(kampfAktionEineHaelfteDerFeinde, kampfAktionAndereHaelfteDerFeinde);
        }
    }

    /**
     * - Und so sieht die Arbeitsteilung aus: Wenn die Anzahl der Feinde, die der Aktion zugeteilt sind,
     * kleiner ist als MAX_ANZAHL_FEINDE, dann kämpft der Held selbst
     */
    protected void kaempfeSelber() {
        for(int i=0; i<MAX_ANZAHL_FEINDE && i<this.feinde.size(); i++) {
            System.out.printf("%s: \"%d Feinde, die erledige ich mit links!\"%n", Thread.currentThread().getName(), this.feinde.size());
            try {
                Thread.sleep(5);
            } catch (InterruptedException exception) {
            }
            System.out.printf("%s: \"%s, zack!\"%n", Thread.currentThread().getName(), this.feinde.get(i).getName());
        }
    }


}
