/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Drache
 *
 ********************************************************************************/



package de.galileocomputing.schroedinger.java.kapitel07.rollenspiel;

public abstract class Drache extends RollenspielCharakter implements Monster{

    public abstract void spucken();
    public void fliegen(){
        //Fliegen
    }

    @Override
    public void bruellen(){
        //Drachenbrueller
    }
}
