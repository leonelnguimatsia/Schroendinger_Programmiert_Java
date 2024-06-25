/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KlasseFile
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.file.io.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;

public class KlasseFile {

    public static void main(String[] args) {

        //1. PFADE KOMBINIEREN kannst du mit resolve():
        Path schlafzimmer = Paths.get("C:\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\wohnung\\schlafzimmer");
        Path krawatten = Paths.get("kleiderschrank\\obersteSchublade\\krawatten");
        Path woSindDieKrawatten = schlafzimmer.resolve(krawatten);
        System.out.println(woSindDieKrawatten);

        //2. PFADE RELATIVIEREN geht mit relativize():
        Path flur = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\wohnung\\flur");
        Path  wohnzimmer = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\wohnung\\ wohnzimmer");
        Path wohnzimmerZuFlur = wohnzimmer.relativize(flur);
        System.out.println(wohnzimmerZuFlur);

        /**
         * 3. Und über PFADE zu ITERIEREN, ist auch möglich:
         * - iterator() gibt einen Iterator von Pfadkomponenten zurück
         * - Die einzelnen Ausgaben sind hier: „schroedinger“, „wohnung“ und „flur“.
         */
        Path pfad = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\wohnung\\flur");
        Iterator<Path> iterator = pfad.iterator();
        while(iterator.hasNext()){
            Path pfadKomponente = iterator.next();
            System.out.println(pfadKomponente);
        }

        //Path datei = Paths.get("datei.txt"); // ermittelst du den absoluten Pfad
        //löst toAbsolutePath() keine relativen Pfade auf
        Path datei = Paths.get("C:.\\src\\de\\galileocomputing\\schroedinger\\java\\kapitel11\\bossingen\\ausgabe\\datei.txt");
        System.out.println(datei.toAbsolutePath());
       try{
           System.out.println(datei.toRealPath()); //ermittelst du den kanonischen Pfad
       } catch (IOException e) {

       }
    }
}
