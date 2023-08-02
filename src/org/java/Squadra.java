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

    //METODI



}