public enum Aktie {
    DE0005104400("ATOSS Software", 22.59f, 23.5f),
    DE0006766504("Arubis", 12.49f, 8.25f),
    DE0005545503("1&1", 6.23f, 3.21f),
    DE0005118806("11880 Solutions", 13.18f, 4.69f),
    DE0005167902("3U", 25.33f, 3.55f),
    DE0005408116("Aareal Bank", 43.29f, 33.85f),
    DE0007471377("Activa Resources", 18.24f, 5.53f),
    DE0005103006("ADVA Optival Networking", 26.23f, 27.25f),
    GB00B128C026("Air Berlin", 2.59f, 1.53f),
    DE0006569403("ALBIS Leasing", 2.59f, 7.45f);
    private final String name;
    private int id;
    private float wert;
    private final float schwankung;
    Aktie(String name, float wert, float schwankung){
        this.name = name;
        this.wert = wert;
        this.schwankung = schwankung;
        this.id = Spieler.aktieId;
        Spieler.aktieId++;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getWert() {
        return wert;
    }
    public void setWert(float wert){
        this.wert = wert;
    }
    public float getSchwankung(){
        return schwankung;
    }
}
