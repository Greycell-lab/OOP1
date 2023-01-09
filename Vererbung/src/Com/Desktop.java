package Com;

public final class Desktop extends Computer {
    public Desktop(String hersteller) {
        super(false, hersteller);
    }

    @Override
    public void setZustand() {
        super.setZustand();
        System.out.println(this.getHersteller() + ": " + "Desktop wurde " + (this.getZustand() ? "eingeschaltet" : "ausgeschaltet"));
    }
}
