package org.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Allenatore allenatore = new Allenatore("Marco", 32, "offensiva");
        Squadra squadra = new Squadra(allenatore);

        String[] nomi = {"michele dalsecco", "paolo albini", "michele ferrante,", "simone zaccagni", "paolo iniesta",
                "fefipe melo", "paolo maldini", "giuseppe franciosi", "luca arduo", "nantay nyang", " matteo delforte",
                "simone bini", "fabio nocciolo", "francesco limone", "gianluigi petrarca", "luigi nzoie", "francesco scamacca",
                "michele rocca", "luigi stoduto", "jacopo ugolini", "davide santerello", "michele depedis", "luca biriolo"};

        String[] ruoli = {"difensore", "centrocampista", "attaccante"};

        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            int numeroCasualeperNomi = rand.nextInt(0, nomi.length);
            int numeroCasualeperRuoli = rand.nextInt(0, ruoli.length);
            int etaCasuale = rand.nextInt(20, 40);
            // System.out.println(nomi[numeroCasualeperNomi] + " " + ruoli[numeroCasualeperRuoli] + " " + etaCasuale);
            Giocatore giocatore = new Giocatore(nomi[numeroCasualeperNomi], etaCasuale, ruoli[numeroCasualeperRuoli]);
            squadra.aggiungiGiocatore(giocatore);
        }

        System.out.println(squadra.getGiocatoreList());
        System.out.println(squadra.getAllenatore());


    }
}
