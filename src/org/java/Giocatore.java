package org.java;

public class Giocatore extends Persona {

    //ATTRIBUTI

    private String ruolo;

    //COSTRUTTORE
    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }


    //GETTER E SETTER
    public String getRuolo() {
        return ruolo;
    }




    //METODI


}
