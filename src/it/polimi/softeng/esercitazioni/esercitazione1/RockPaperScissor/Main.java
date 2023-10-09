package it.polimi.softeng.esercitazioni.esercitazione1.RockPaperScissor;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Federico");
        Player p2 = new Player("Giacomo");
        RPS_Simulator.simulateMatch(p1,p2,4);
    }
}
