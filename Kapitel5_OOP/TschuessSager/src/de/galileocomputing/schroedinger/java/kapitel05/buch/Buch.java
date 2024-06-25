/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Buch
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.buch;

public class Buch {

    public  static final int MIN_SEITENZAHL = 49;
    public  static final int MAX_SEITENZAHL = 50560;

    private String autor;
    private String titel;
    private int seiteAnzahl;
    private boolean gebunden;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getSeiteAnzahl() {
        return seiteAnzahl;
    }

    public void setSeiteAnzahl(int seiteAnzahl) {

        if(seiteAnzahl >= MIN_SEITENZAHL && seiteAnzahl <= MAX_SEITENZAHL){
            this.seiteAnzahl = seiteAnzahl;
        }else{
            System.err.println("Die minimale Seiteanzahl ist kleiner als 49 oder  der maximalen Seiteanzahl ist größer als 50560");
        }
    }

    public boolean isGebunden() {
        return gebunden;
    }

    public void setGebunden(boolean gebunden) {
        this.gebunden = gebunden;
    }

    public void lesen(){

        System.out.println("Eigenschaften des Buches:\n "+
                "- Autor: "+this.getAutor()+"\n"+
                "- Titel: "+this.getTitel()+"\n"+
                "- SeitenAnzahl: "+this.getSeiteAnzahl()+"\n"+
                "- Gebunden: "+this.isGebunden());
    }
}
