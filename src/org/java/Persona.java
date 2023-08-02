package org.java;

public class Persona {

    //ATTRIBUTI

    private String nome;
    private int eta;

    //COSTRUTTORE
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }




    //METODI


    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
