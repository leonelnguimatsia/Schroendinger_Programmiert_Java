/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KundenDatenKonvertiererIO
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.kundendaten;

import java.io.*;

public class KundenDatenKonvertiererIO implements KundenDatenKonvertierer {

    private static final int ANZAHL_WERTE = 4;

    @Override
    public void konvertiereKundendaten(File quelle, File ziel) {

        /**
         * - BufferedWriter und BufferedReader mit geschachteltem FileWriter bzw. FileReader sind hier
         * die geeignete Wahl. Alles wird innerhalb von try()initialisiert.
         */
        try(BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(ziel));
        BufferedReader dateiLeser = new BufferedReader(new FileReader(quelle))){

            int zeilenNummer = 0;
            String eingabeZeile;

            //Gelesen wird so lange, bis readLine() ein null zurückgibt
            while((eingabeZeile = dateiLeser.readLine()) != null){

                /**
                 * - Es kann auch leere Zeilen geben, dann ist der Wert von zeile leer, nicht null!
                 * Leere Zeilen beachten wir aber gar nicht
                 */
                if(!eingabeZeile.isEmpty()){

                    /**
                     * - Alles, was in einer Zeile vor dem Doppelpunkt steht, brauchen wir nicht
                     * - spilt(:): teilt die Zeichenkette eingabeZeile an jedem Vorkommen des Doppelpunkts ":" auf und
                     * gibt ein Array von Teilstücken zurück.
                     * - [1]: wählt das Teilstück aus dem resultierenden Array aus, das den Text nach dem Doppelpunkt enthält.
                     * - tim() in Java wird verwendet, um führende und abschließende Leerzeichen in einem String zu entfernen
                     */
                    String ausgabe = eingabeZeile.split(":")[1].trim();

                    //Anhand der Zählervariablen zeilenNummer bestimmen wir wann ein Komma hinzugefügt.

                    if(zeilenNummer%ANZAHL_WERTE < 3){

                        ausgabe = ausgabe + ", ";

                    }


                    /**
                     * - Anhand der Zählervariablen zeilenNummer bestimmen wir, wann eine neue Zeile begonnen werden soll.
                     * Statt \n geht das hier übrigens bequem mit der Methode newLine()
                     */
                    if(zeilenNummer > 0 && zeilenNummer%ANZAHL_WERTE == 0){

                        dateiSchreiber.newLine();
                    }

                    //Danach wird die Zeile über den BufferedWriter geschrieben
                    dateiSchreiber.write(ausgabe);
                    zeilenNummer++;
                }

            }

        } catch (IOException e) {

        }

    }

    /**
     * - Erst stellst du über diese Schritte sicher, dass es das Zielverzeichnis gibt,
     * - dann liest du alle Dateien im Quellverzeichnis
     * -  Der Zielpfad der einzelnen Zieldateien ergibt sich aus dem Pfad des Zielverzeichnisses, dem Namen der gelesenen Textdatei, getrennt
     * durch File.separator und natürlich mit neuer Dateiendung.
     * - Und damit kannst du prima die bereits vorhandene Methode konvertiereKundendaten() wiederverwenden
     * - listFiles() gibt es auch in der Variante mit einer Instanz von FilenameFilter als Parameter
     * @param quellVerzeichnis
     * @param zielVerzeichnis
     */
    @Override
    public void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis, File zielVerzeichnis) {
        if(zielVerzeichnis != null){
            if(!zielVerzeichnis.exists()){
                zielVerzeichnis.mkdirs();
            }
            for(File datei : quellVerzeichnis.listFiles(textDateienFilter)){
                String zielPfad = zielVerzeichnis.getPath() + File.separator + datei.getName().replace(".txt",".csv");
                this.konvertiereKundendaten(datei, new File(zielPfad));
            }
        }
    }

    /**
     * - FilenameFilter ist ein Interface und ein typisches Beispiel dafür, wann lokale bzw. anonyme Klassen sinnvoll sind.
     * - accept() wird für jede Datei in dem entsprechenden Verzeichnis aufgerufen. Als Parameter bekommt die Methode das
     * Verzeichnis und den Namen der jeweiligen Datei. Über den Rückgabewert sagst du, ob du eine Datei berücksichtigen möchtest
     * oder nicht. true heißt ja, false heißt nein
     */
    FilenameFilter textDateienFilter = new FilenameFilter() {
        @Override
        public boolean accept(File verzeichnis, String dateiName) {
            return dateiName.endsWith(".txt");
        }
    };
}
