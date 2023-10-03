package it.polimi.softeng.esercitazione1.LancioMoneta;

public class Main {
    public static void main(String[] args) {
        Coin c = new Coin();
        for (int i = 0; i<10; i++) {
            c.toss();
            System.out.println(c.getShowingSide());
        }
    }
}