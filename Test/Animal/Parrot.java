package Animal;

public class Parrot extends Bird {
    public Parrot() {
        super(true);
    }

    public String action() {
        return super.action() + " and talks";
    }
}