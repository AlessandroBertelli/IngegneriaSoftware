package it.polimi.softeng.esercitazioni.esercitazione1.RockPaperScissor;

import java.util.Random;

public class Player {

    private Shape shape;

    final private Random generator;

    final private String name;

    public Player( String name) {
        this.shape = null;
        this.generator = new Random();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void throwShape() {
        switch (this.generator.nextInt(3)){
            case 0 -> this.shape = Shape.PAPER;
            case 1 -> this.shape = Shape.ROCK;
            case 2 -> this.shape = Shape.SCISSORS;
        }
    }

    public Shape getShape() {
        return shape;
    }
}
