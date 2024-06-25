/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: AlterKarton
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel10.bevor.generics;

/**
 * du hättest eine Klasse schreiben wollen, die einen Karton dar￾stellt, in den du einen beliebigen
 * Gegenstand reinpacken kannst.
 */
public class AlterKarton {

    //"Beliebiger Gegenstand" bedeutet in Java die Klasse Object
   private Object inhalt;

   public AlterKarton(Object inhalt) {

       this.inhalt = inhalt;
   }

   //Rein kommt ein Object
    public Object getInhalt() {
        return inhalt;
    }

    //und rauskommt ein Object
    public void setInhalt(Object inhalt) {
        this.inhalt = inhalt;
    }
}
