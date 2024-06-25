/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Lottoschein
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel05.klassenmethoden;

public class Lottoschein {

    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(args[0]);
        int zahl2 = Integer.parseInt(args[1]);
        int zahl3 = Integer.parseInt(args[2]);
        int zahl4 = Integer.parseInt(args[3]);
        int zahl5 = Integer.parseInt(args[4]);
        int zahl6 = Integer.parseInt(args[5]);
        int zahl7 = Integer.parseInt(args[6]);


        druckeLottoschein(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7);
    }

    private static void druckeLottoschein(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6, int zahl7) {
        for(int i = 0; i <= 49; i++) {
            druckeLottoscheinKästchen(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7, i);
            testeUndDruckeNeueZeile(i);
        }
    }

    private static void druckeLottoscheinKästchen(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6, int zahl7, int i) {
        if(i == zahl1 || i == zahl2 || i == zahl3 || i == zahl4 || i == zahl5 || i == zahl6 || i == zahl7) {
            System.out.println("|x|");

        }else{
            System.out.println("|_|");
        }
    }

    private static void testeUndDruckeNeueZeile(int i) {
        if(i % 7 == 0){
            System.out.println("");
        }
    }

}
