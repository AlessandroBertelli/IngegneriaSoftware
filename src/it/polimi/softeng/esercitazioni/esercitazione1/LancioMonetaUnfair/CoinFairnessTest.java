package it.polimi.softeng.esercitazioni.esercitazione1.LancioMonetaUnfair;

import it.polimi.softeng.esercitazioni.esercitazione1.LancioMoneta.Side;

public final class CoinFairnessTest {

    private static final int N = 2000;

    private static final double defaultTolerance = 0.05;

    private CoinFairnessTest(){

    }
    public static boolean isFair(Coin coin, double tolerance) {
        int heads = 0;
        for (int i = 0;i<N;i++){
            coin.toss();
            if(coin.getShowingSide()==Side.HEAD) {
                heads++;
            }
        }
        double p = (double) heads / N;
        System.out.println(p);
        return 0.5 - tolerance / 2 < p && p < 0.5 + tolerance / 2;
    }

    public static boolean isFair(Coin coin) {
        return isFair(coin,defaultTolerance);
    }

}
