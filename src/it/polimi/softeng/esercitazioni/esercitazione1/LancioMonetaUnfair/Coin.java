package it.polimi.softeng.esercitazioni.esercitazione1.LancioMonetaUnfair;

import it.polimi.softeng.esercitazioni.esercitazione1.LancioMoneta.Side;

import java.util.Random;

public class Coin {
    private Side showingSide;

    private double pHead;
    final private Random generator;
    final private static int seed = 2022;

    public Coin() {
        this.showingSide = null;
        this.generator = new Random(seed);
        this.pHead = 0.5;
    }

    public Coin(double pHead) {
        this.showingSide = null;
        this.generator = new Random(seed);
        this.pHead = pHead;
    }

    public void toss() { // edit metod to toss coin with pHead probability
        if (this.generator.nextDouble() <= 0.5) this.showingSide = Side.HEAD;
        else this.showingSide = Side.TAIL;
    }

    public Side getShowingSide() {
        return this.showingSide;
    }

}
