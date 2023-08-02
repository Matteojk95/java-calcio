package org.java;

public class Arbitro extends Persona{

    //ATTRIBUTI
    private String ruolo;

 //COSTRUTTORE

    public Arbitro(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }


    //GETTER E SETTER
    public String getRuolo() {
        return ruolo;
    }
}

