package ro.scoalainformala;


import ro.scoalainformala.domain.*;

public class Main {
    public static void main(String[] args) {
        Gastropoda[] g = {
                new AbaloneShell("Abalone", "green"),
                new ConchSnail("Conch", "pink"),
                new Snail("Snail", "orange"),
                new TurbanShell("Turban", "red"),
                new AbaloneShell("Abalone", "blue"),
                new Snail("Snail", "brown")
        };
        for (Gastropoda a : g) {
            System.out.println("For the gastropoda " + a.getName() + " the result is: " + a.makeMotherOfPearls());
        }

        Gastropoda ab = new AbaloneShell("Abalone", "green");
        System.out.println(ab);
        System.out.println("Is gastropoda ab the same with Abalone? the answer is: " + ab.equals(g[0]));
        Gastropoda co = new ConchSnail("Conch", "red");
        System.out.println(co);
        System.out.println("Is gastropoda co the same with Conch? the answer is: " + co.equals(g[1]));
        Gastropoda sn = new Snail("Snail", "brown");
        System.out.println(sn);
        System.out.println("Is gastropoda sn the same with Snail? the answer is: " + sn.equals(g[5]));
        Gastropoda tu = new TurbanShell("Turban", "red");
        System.out.println(tu);
        System.out.println("Is gastropoda tu the same with Turban? the answer is: " + tu.equals(g[3]));
    }
}