/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BigDecimal
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GenauRechnen {


    public static void main(String[] args) {

        BigDecimal zehn = new BigDecimal("10");
        BigDecimal drei = new BigDecimal("3");
        BigDecimal ergebnis = zehn.divide(drei,16, RoundingMode.HALF_UP);
        System.out.println(ergebnis);

    }

}