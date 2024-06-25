/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.lockoject;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Die Basisklasse für unsere Helden ist erstmal noch ganz simpel mit einem Datenfeld, einem Getter
 */
public abstract class Held {

    private String name;
    /**
     * - ReentrantLock ist im Übrigen nur eine der Implementierungen von Lock. Das im Detail zu erklären, würde jetzt aber wirklich zu weit gehen:
     * - Das ReentrantLock sorgt dafür, dass die Methodenaufrufe koordiniert werden und in der gewünschten Reihenfolge ausgeführt werden.
     */
    private Lock lock = new ReentrantLock();

    public Held(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * - Die besuchen()-Methode von Held ist jetzt nicht mehr synchronized. Stattdessen gibt es eine neue Methode
     * treffenBei(), die feststellt, bei welchem Helden man sich trifft und bevor ein Held den anderen besucht,
     * stellt er über diese Methode erstmal sicher, ob der Besuch überhaupt so abgesprochen war. Und diese Absprache
     * wird über zwei Instanzen von Lock implementiert (eine in jeder Helden￾instanz). Entweder der Zwerg bekommt die Locks
     * oder der Nachtelf, aber nicht beide gleichzeitig.
     */
    public boolean treffenBei(Held held){

        Boolean ichSageWirTreffenUnsBeiIhm = false;
        Boolean erSagtWirTreffenUnsBeiIhm = false;
        Boolean treffenBeiIhm = false;

        /**
         * - Interessant ist jetzt der Inhalt der treffenBei()-Methode. Denn die darf ja immer nur für einen der beiden Helden ein
         * true zurückgeben und muss für den anderen ein false zurückgeben. Zwei Booleans, die festhalten, ob beide mit dem Treffpunkt
         * einverstanden sind.
         * - Hier wird versucht, beide Locks zu bekommen bzw. sich über den Treffpunkt einig zu werden.
         * - Wenn wir nicht beide Locks bekommen haben, prüfen wir, ob wir eines bekommen haben, und geben das dann frei
         */
        try{
            ichSageWirTreffenUnsBeiIhm = lock.tryLock();
            erSagtWirTreffenUnsBeiIhm = held.getLock().tryLock();
            treffenBeiIhm = ichSageWirTreffenUnsBeiIhm && erSagtWirTreffenUnsBeiIhm;
        }finally{
            if(!treffenBeiIhm){
                System.out.println(this.getName() + ":\"Nächstes Mal treffen wir uns dann eben bei ihm.\"");
            }
            if(ichSageWirTreffenUnsBeiIhm) {
                lock.unlock();
            }
            if(erSagtWirTreffenUnsBeiIhm) {
                held.getLock().unlock();
            }
        }
        return treffenBeiIhm;
    }

    protected Lock getLock() {
        return lock;
    }
    /**
     * - Auf einer Objektinstanz von Held kann von verschiede￾nen Threads aus immer
     * nur eine der beiden Methoden, aber nicht beide gleichzeitig, aufgerufen werden
     * - Die Helden warten ein bisschen
     * @param held
     */
    public void besuchen(Held held) {

        if(this.treffenBei(held)){
            System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());
            //Und das hier ist die kritische Stelle, die den Deadlock auslöst, aber was da passiert, gucken wir uns gleich mal genauer an.
            held.besuchEmpfangen(this);
        }

    }

    public void besuchEmpfangen(Held held) {

        System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());
    }
}
