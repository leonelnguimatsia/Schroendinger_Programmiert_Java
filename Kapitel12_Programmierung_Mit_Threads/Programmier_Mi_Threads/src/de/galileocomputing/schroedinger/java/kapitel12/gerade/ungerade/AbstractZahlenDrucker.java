package de.galileocomputing.schroedinger.java.kapitel12.gerade.ungerade;

//Du implementierst das ZahlenDrucker-Interface und Runnable, damit du den Zahlendrucker auch starten kannst
public abstract class AbstractZahlenDrucker implements Runnable, Zahlendrucker {

    private int grenze;

    /**
     * Grenze gibt die Anzahl der zu druckenden Zahlen an
     * @param grenze
     */
    public AbstractZahlenDrucker(int grenze) {

        this.grenze = grenze;
    }

    /**
     * - Ein Interface, für das du zwei Implementierungen schreibst, einen
     * GeradeZahlenDrucker und einen UngeradeZahlenDrucker
     *
     * @param zahl
     */
    @Override
    public void druckeZahl(int zahl) {

        System.out.println(zahl);
    }

    /**
     * - Die run()-Methode muss natürlich auch implementiert werden. Hier passiert schließlich die Äktschion! Egal,
     * ob man ungerade oder gerade Zahlen drucken will, der Inhalt der run()-Methode ist in beiden
     * Fällen komplett gleich. Deswegen bist du hier mit einer abstrakten Oberklasse am besten bedient.
     * - Ja, hier wird die Zahl gedruckt. Was dachtest du denn?
     */
    @Override
    public void run() {

        //So kann nur ein Thread in den synchronisierten Block hinein
        synchronized (AbstractZahlenDrucker.class) {
            for(int i = 0; i < this.grenze; i++) {

                if(this.akzeptiereZahl(i)){

                    /**
                     * - Vor dem Aufruf von druckeZahl() ein Thread.sleep() setzen.
                     * Damit sagst du einem Thread explizit, dass er eine angegebene Zeit warten soll
                     */
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    /**
                     * - Um zu sehen, welcher Thread was macht, kannst du dir jederzeit den Namen des aktuell ausgeführten Threads
                     * ausgeben lassen.
                     */
                    System.out.println(Thread.currentThread().getName());
                    this.druckeZahl(i);
                }
            }
        }
    }

    //Ob eine Zahl gedruckt werden soll oder nicht, hältst du noch abstrakt, die Entscheidung trifft jeweils die Unterklasse.
    protected abstract boolean akzeptiereZahl(int zahl);
}
