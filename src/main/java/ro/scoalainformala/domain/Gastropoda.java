package ro.scoalainformala.domain;

public abstract class Gastropoda {

    private String name;
    private String colour;

    public Gastropoda(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public abstract String makeMotherOfPearls();
}
