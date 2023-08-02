package org.java;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

    //ATTRIBUTI

    private List<Giocatore> giocatoreList;
    private Allenatore allenatore;


    //COSTRUTTORE

    public Squadra(Allenatore allenatore) {
        this.allenatore = allenatore;
        this.giocatoreList = new ArrayList<>();
    }

    public List<Giocatore> getGiocatoreList() {
        return giocatoreList;
    }

    public Allenatore getAllenatore() {
        return allenatore;
    }
//METODI

public void aggiungiGiocatore(Giocatore giocatore){
        giocatoreList.add(giocatore);
}

}