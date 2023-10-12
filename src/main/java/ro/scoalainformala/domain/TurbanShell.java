package ro.scoalainformala.domain;

public class TurbanShell extends Gastropoda {
    public TurbanShell(String name, String colour) {
        super(name, colour);
    }

    @Override
    public String makeMotherOfPearls() {
        return "Mpther of pearls of natural ivory patterns of color";
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
        if (obj instanceof TurbanShell) {
            TurbanShell other = (TurbanShell) obj;
            return this.getName().equals(other.getName()) && this.getColour().equals(other.getColour());
        }
        return false;
    }
}
