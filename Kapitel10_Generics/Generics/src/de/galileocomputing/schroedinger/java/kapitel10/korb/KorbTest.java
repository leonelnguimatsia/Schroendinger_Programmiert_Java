/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: KorbTest
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel10.korb;

public class KorbTest {

    public static void main(String[] args) {
        Hunde hunde = new Hunde();
        Katze katze = new Katze();

        /**
         * - Das hier ist der Hundenkorb, und weil da nur einen Hund rein kann.
         * - kann auch nur einen Hund rauskommen
         */
        Korb<Hunde> hundenKorb = new Korb<>();
        hundenKorb.setBewohner(hunde);
        Hunde hundeAusKorb = hundenKorb.getBewohner();

        /**
         * - Das hier ist der Katzenkorb, und weil da nur eine Katze rein kann.
         * - kann auch nur eine Katze rauskommen
         */
        Korb<Katze> katzenKorb = new Korb<>();
        katzenKorb.setBewohner(katze);
        Katze katzeAusKorb = katzenKorb.getBewohner();

        /**
         * - Bei der Objektinstanziierung müsstest du den Typ dann nicht mehr extra angeben:
         */
        KatzenKorb katzenKorb1 = new KatzenKorb();
        HundeKorb hundenKorb1 = new HundeKorb();
    }
}
