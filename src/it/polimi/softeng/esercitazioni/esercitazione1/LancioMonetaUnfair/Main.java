package it.polimi.softeng.esercitazioni.esercitazione1.LancioMonetaUnfair;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Coin coin;
        for (int i = 0; i < 15; i++) {
            coin = new Coin(new Random().nextDouble());
            System.out.println(coin.getShowingSide()+ " fair: " + CoinFairnessTest.isFair(coin));
        }
    }
}
