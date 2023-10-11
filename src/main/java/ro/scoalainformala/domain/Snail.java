package ro.scoalainformala.domain;

public class Snail extends Gastropoda {
    public Snail(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "White Mother of Pearl with violet to green iridescence";
    }
}
