package org.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nomi = {"michele dalsecco", "paolo albini", "michele ferrante,", "simone zaccagni", "paolo iniesta",
        "fefipe melo", "paolo maldini", "giuseppe franciosi", "luca arduo", "nantay nyang", " matteo delforte",
        "simone bini", "fabio nocciolo", "francesco limone", "gianluigi petrarca", "luigi nzoie", "francesco scamacca",
        "michele rocca", "luigi stoduto", "jacopo ugolini", "davide santerello", "michele depedis", "luca biriolo"};

        String[] ruoli={ "difensore", "centrocampista", "attaccante"};

        Random rand = new Random();
        int numeroCasualeperNames =rand.nextInt(0, nomi.length);
        int numeroCasualeperRuoli= rand.nextInt(0, ruoli.length);
        System.out.println(nomi[numeroCasualeperNames]+" "+ ruoli[numeroCasualeperRuoli]);


    }
}