package ro.scoalainformala.domain;

public class Snail extends Gastropoda {
    public Snail(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "White Mother of Pearl with violet to green iridescence";
    }

    @Override
    public String toString() {
        return "Gastopoda " + getName() +" " + getColour();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Snail) {
            Snail other = (Snail) obj;
            return this.getName().equals(other.getName()) && this.getColour().equals(other.getColour());
        }
        return false;
    }
}

