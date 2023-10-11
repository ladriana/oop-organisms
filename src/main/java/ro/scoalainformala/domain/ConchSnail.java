package ro.scoalainformala.domain;

public class ConchSnail extends Gastropoda {
    public ConchSnail(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "The color can range from white to pink, also occurring in brown and orange tones!";
    }
}
