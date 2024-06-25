/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: FotoShooting
 *
 ********************************************************************************/


package de.galileocomputing.schroedinger.java.kapitel05.objektmethode;

public class FotoShooting {

    public static void main(String[] args) {

        FotoApparat fotoApparat = new FotoApparat();
        fotoApparat.setObjektiv(new Objektiv(18,100));
        fotoApparat.setBildStabilisiert(true);
        fotoApparat.setDisplayGroesse(7.5);
        fotoApparat.setMarke("SoNie");
        fotoApparat.setMegaPixel(10);
        fotoApparat.setHerstellungsLand("Deutschland");
        String beschreibung = fotoApparat.toString();
        System.out.println("---------------FotoApparat1----------------------");
        System.out.println(beschreibung);

        FotoApparat fotoApparat2 = new FotoApparat();
        fotoApparat2.setObjektiv(new Objektiv(50,270));
        fotoApparat2.setBildStabilisiert(true);
        fotoApparat2.setDisplayGroesse(9.5);
        fotoApparat2.setMarke("SoNie");
        fotoApparat2.setMegaPixel(18);
        fotoApparat2.setHerstellungsLand("Kamerun");
        String beschreibung2 = fotoApparat2.toString();
        System.out.println("---------------FotoApparat2----------------------");
        System.out.println(beschreibung2);



    }
}
