/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: Held
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel12.livelock;


/**
 * - Die Basisklasse für unsere Helden ist erstmal noch ganz simpel mit einem Datenfeld, einem Getter
 */
public abstract class Held {

    private String name;

    /**
     * - Die Helden bekommen die Eigenschaft durstig plus Setter und Getter sowie eine Methode, die das Biertrinken
     * simuliert. Und weil es keinen Spaß macht, alleine zu trinken, hat die Methode neben dem Bier noch einen weiteren Parameter, um den
     * Trinkpartner anzugeben.
     */
    private boolean durstig;

    public Held(String name){
        this.name = name;
        this.durstig = true;
    }

    public String getName() {
        return name;
    }

    public boolean isDurstig(){

        return durstig;
    }

    /**
     * @param bier
     * @param trinkPartner
     */
    public void trinken(Bier bier, Held trinkPartner){

        int zaehler = 0;

        while(this.isDurstig() && zaehler < 5){

            //Das Biertrinken, pardon, der Versuch, Bier zu trinken, funktioniert so: Solange der jeweilige Held durstig ist und
            //nicht selbst das Bier hat, macht er gar nichts, außer zu warten.
            if(bier.getBesitzer() != this){
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
                // Wenn er das Bier hat, bietet er seinem trinkPartner das Bier an, sofern der noch Durst hat, gibt ihm das Bier und wartet
                // wieder geduldig.
            } else if (trinkPartner.isDurstig()) {
                System.out.printf("%s: Trink du mal zuerst, mein Freund %s!%n", name, trinkPartner.getName());
                bier.setBesitzer(trinkPartner);

                //Rein theoretisch würde ja jeder Held das Bier trinken wollen. Nur leider tritt dieser Fall niemals ein, denn der andere Held
                //geht ja genauso vor.
            }else{
                bier.trinken();
                this.durstig = false;
                System.out.printf("%s: \"Das war lecker!\"%n", name);
                bier.setBesitzer(trinkPartner);
            }
            zaehler++;
        }
    }


}
