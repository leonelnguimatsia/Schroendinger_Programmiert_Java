/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: BankTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel07.verschachteltenklassen.nichtstatischen.memberklassen;

public class BankTest {

    public static void main(String[] args) {

        //Nichtstatisch – jetzt brauchst du eine Bank, um einen Tresor zu bauen
        Bank bank = new Bank();
        Bank.Tresor tresor = bank.new Tresor();
    }
}
