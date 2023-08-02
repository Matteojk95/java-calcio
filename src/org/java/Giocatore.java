package org.java;

import java.util.Random;

public class Giocatore extends Persona {

    //ATTRIBUTI

    private String ruolo;
    Random rand= new Random();

    //COSTRUTTORE
    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }

    //GETTER E SETTER

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }




    //METODI


    @Override
    public String toString() {
        return super.toString() +"-"+ruolo;
    }
}
