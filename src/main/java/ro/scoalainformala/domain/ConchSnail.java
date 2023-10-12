package ro.scoalainformala.domain;

import java.util.Objects;

public class ConchSnail extends Gastropoda {
    public ConchSnail(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "Mother of pearl can range from white to pink, also occurring in brown and orange tones!";
    }

    @Override
    public String toString() {
        return "Gastopoda " + getName() + " " + getColour();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof ConchSnail) {
            ConchSnail other = (ConchSnail) obj;
            return this.getName().equals(other.getName()) && this.getColour().equals(other.getColour());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
