/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: FotoApparat
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.objektmethode;

public class FotoApparat {

    private int megaPixel;
    private double displayGroesse;
    private boolean bildStabilisiert;
    private String marke; // String-Variablen zum Beispiel wären Referenztypen
    private Objektiv objektiv;
    private String herstellungsLand;

    public FotoApparat() {

    }

    public FotoApparat(int megaPixel, double displayGroesse, boolean bildStabilisiert, String marke, Objektiv objektiv, String herstellungsLand) {
        super();
        this.megaPixel = megaPixel;
        this.displayGroesse = displayGroesse;
        this.bildStabilisiert = bildStabilisiert;
        this.marke = marke;
        this.objektiv = objektiv;
        this.herstellungsLand = herstellungsLand;
    }


    public void setMegaPixel(int megaPixel){

        if(megaPixel >= 1 || megaPixel <= 20){

            this.megaPixel = megaPixel;
        }
    }

    public int getMegaPixel(){
        return megaPixel;
    }

    public void setDisplayGroesse(double displayGroesse){
        this.displayGroesse = displayGroesse;
    }

    public double getDisplayGroesse(){
        return displayGroesse;
    }

    public void setBildStabilisiert(boolean bildStabilisiert) {

        this.bildStabilisiert = bildStabilisiert;
    }

    //Bei Booleschen Objektvariablen kannst du statt "get" auch "is" für Getter nehmen
    public boolean isBildStabiliert(){

        return bildStabilisiert;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public String getHerstellungsLand() {
        return herstellungsLand;
    }

    public void setHerstellungsLand(String herstellungsLand) {
        this.herstellungsLand = herstellungsLand;
    }

    @Override
    public String toString() {
        return "FotoApparat Eigenschaften :\n" +
                "[- megaPixel= " + megaPixel +"\n"+
                " - displayGroesse= " + displayGroesse +"\n"+
                " - bildStabilisiert= " + bildStabilisiert +"\n"+
                " - marke= " + marke + "\n" +
                " - objektiv(brennweiteMin,brennweiteMax)= " +"(" +objektiv.getBrennweiteMin()+","+objektiv.getBrennweiteMax()+")\n"+
                " - herstellungsLand= " + herstellungsLand + "\n" +
                ']';
    }

}
