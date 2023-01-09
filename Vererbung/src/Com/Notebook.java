package Com;

public final class Notebook extends Computer {
    public Notebook(String hersteller) {
        super(false, hersteller);
    }

    @Override
    public void setZustand() {
        super.setZustand();
        System.out.println(this.getHersteller() + ": " + "Notebook wurde " + (this.getZustand() ? "eingeschaltet" : "ausgeschaltet"));
    }
}
