/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Speiseplanhacker
 *
 ********************************************************************************/


package de.galileacomputing.schroedinger.java.kapitel04;

public class Speiseplanhacker {

    public static void main(String[] args) {

        String [] speise = {"Dinkelpfannekuchen","Dinkel mit Salat"};

        System.out.println("Heute gibts: ");
        for(int i =0; i<speise.length; i++){

           String ersetzeSpeise = speise[i];

           if(ersetzeSpeise != null && ersetzeSpeise.startsWith("Dinkel")){

               if("Dinkelpfannekuchen".equals(ersetzeSpeise)){

                   ersetzeSpeise = "Hamburg";
               }else {

                   ersetzeSpeise = ersetzeSpeise.substring("Dinkel".length());
                   ersetzeSpeise = "Hamburger"+ ersetzeSpeise;
               }
           }

           if(ersetzeSpeise != null && ersetzeSpeise.contains("Salat")){

               ersetzeSpeise = ersetzeSpeise.replaceAll("Salat", "Pommes");
           }

            System.out.println(ersetzeSpeise);
        }

    }
}
