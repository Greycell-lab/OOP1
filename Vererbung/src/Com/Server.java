package Com;

public final class Server extends Computer {
    public Server(String hersteller) {
        super(false, hersteller);
    }

    @Override
    public void setZustand() {
        super.setZustand();
        System.out.println(this.getHersteller() + ": " + "Server wurde " + (this.getZustand() ? "eingeschaltet" : "ausgeschaltet"));
    }
}
