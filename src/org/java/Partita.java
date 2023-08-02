package org.java;

public class Partita {

    //ATTRIBUTI
    private Squadra squadracasa;
    private Squadra squadraospite;
    private Arbitro arbitro;

    //COSTRUTTORE
    public Partita(Squadra squadracasa, Squadra squadraospite, Arbitro arbitro) {
        this.squadracasa = squadracasa;
        this.squadraospite = squadraospite;
        this.arbitro = arbitro;
    }

    //GETTER E SETTER
    public Squadra getSquadracasa() {
        return squadracasa;
    }

    public Squadra getSquadraospite() {
        return squadraospite;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
}
