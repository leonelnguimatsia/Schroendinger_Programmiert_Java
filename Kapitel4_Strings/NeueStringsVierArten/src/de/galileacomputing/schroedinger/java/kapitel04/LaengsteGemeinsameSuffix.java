/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: LaengsteGemeinsameSuffix
 *
 ********************************************************************************/

package de.galileacomputing.schroedinger.java.kapitel04;

public class LaengsteGemeinsameSuffix {

    public static void main(String[] args) {

        String s1 = "Tischlerei";
        String s2 = "Fischerei";

        if(s1.endsWith("erei") && s2.endsWith("erei") && s1.length() > s2.length()){

            System.out.println("Das längste GemeinsameSuffix ist: "+s1);

        } else if (s1.endsWith("erei") && s2.endsWith("erei") && s2.length() > s1.length()) {

            System.out.println("Das längste GemeinsameSuffix ist: "+s2);
        }else{

            System.out.println("Es gibt keine längste GemeinsameSuffix, da beide String nicht gleiche suffix haben.");
        }
    }
}
