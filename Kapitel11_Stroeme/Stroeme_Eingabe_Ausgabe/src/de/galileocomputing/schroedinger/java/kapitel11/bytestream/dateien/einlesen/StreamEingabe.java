/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: StreamEingabe Datei Einlesen
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel11.bytestream.dateien.einlesen;

import java.io.*;

public class StreamEingabe {

    public static void main(String[] args) {

        /**
         * - Alle Streams sind AutoClosable. Am besten ist daher, du instanziierst sie jeweils innerhalb des try()
         * - java.io. InputStream ist die abstrakte Basisklasse für Eingabe-Streams
         * - Wenn du die Daten aus einer Datei lesen möchtest, nimmst du den FileInputStream. Der bekommt als Parameter eine Datei
         * (in Form eines Objekts vom Typ File – dazu später mehr).
         * - Der Parameter von File wiederum ist ein Pfad im Dateisystem, zum Beispiel ein relativer Pfad zu einer Datei wie hier im Beispiel.
         * Aber Achtung, zwischen den einzelnen Betriebssystemen gibt es Unterschiede: In Windows nimmst du als Trennsymbol „\\“, bei Linux-Systemen
         * stattdessen ein „/“. Oder du greifst direkt auf die Konstante File.separator zu, die das entsprechende Zeichen betriebssystemunabhängig bereitstellt.
         */
        try(InputStream eingabe = new FileInputStream(new File(".\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\dateien\\einlesen\\keineBinaerDatei.txt"))){

            int eingelesenesByte;

            /**
             * - Über die Methode read() von InputStream kannst du einzelne Bytes einlesen, die du jeweils als int zurückbekommst.
             * - read() wird so lange aufgerufen, bis -1 zurückgeliefert wird, was bedeutet, dass der Stream zu Ende ist bzw. das Dateiende erreicht ist.
             * - Diesen Cast kannst du natürlich nur machen, weil du weißt, dass eigentlich eine Textdatei gelesen wurde. Und überhaupt:
             * Das hier dient gerade nur Demozwecken, verstanden?
             */
            while ((eingelesenesByte = eingabe.read()) != -1){
                System.out.print((char)eingelesenesByte);
            }
        } catch (IOException e) {

        }

    }
}
