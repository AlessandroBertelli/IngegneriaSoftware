package it.polimi.softeng.esercitazione1.RockPaperScissor;

public final class RPS_Simulator {

    private RPS_Simulator() {
    }

    public static Player simulateMatch ( Player p1, Player p2, int pointsToWin) {
        int p1points = 0, p2points = 0;

        while(p1points < pointsToWin && p2points < pointsToWin) {
            p1.throwShape();
            p2.throwShape();
            System.out.println(p1.getName()+" throws "+ p1.getShape());
            System.out.println(p2.getName()+" throws "+ p2.getShape());

            int winner = calculateGameWinner(p1,p2);
            if(winner==0) System.out.println("It's a draw!");
            else {
                if (winner == 1) {

                    System.out.println(p1.getName() + " wins the game!");
                    p1points++;
                } else {
                    System.out.println(p2.getName() + " wins the game!");
                    p2points++;
                }
            }
            System.out.println("Current result: "+p1.getName() +" "+p1points+", "+p2.getName()+" "+p2points+"\n");
        }
        if (p1points > p2points) {
            System.out.println(p1.getName() + " WINS THE MATCH!");
            return p1;
        } else {
            System.out.println(p2.getName() + " WINS THE MATCH!");
            return p2;
        }
    }

    private static int calculateGameWinner(Player p1, Player p2) {
        if(p1.getShape() == p2.getShape()) return 0;
        switch (p1.getShape()) {
            case PAPER -> {
                if (p2.getShape() == Shape.ROCK) return 1;
                return 2;
            }
            case ROCK -> {
                if (p2.getShape() == Shape.PAPER) return 2;
                return 1;
            }
            default -> {
                if (p2.getShape() == Shape.PAPER) return 1;
                return 2;
            }
        }
    }


}
