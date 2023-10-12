package ro.scoalainformala.domain;

public class AbaloneShell extends Gastropoda {
    public AbaloneShell(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "Mother of pearl in rainbow color such as blues, greens, purples and yellows!";
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
        if (obj instanceof AbaloneShell) {
            AbaloneShell other = (AbaloneShell) obj;
            return this.getName().equals(other.getName()) && this.getColour().equals(other.getColour());
        }
        return false;
    }
}
