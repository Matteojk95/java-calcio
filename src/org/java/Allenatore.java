package org.java;

public class Allenatore extends Persona{

//ATTRIBUTI

    private String strategia;

    //COSTRUTTORE
    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }


    //GETTER E SETTER
    public String getStrategia() {
        return strategia;
    }




    //METODI


}
