package Städte;

public class Landeshauptstadt extends Stadt {
    private String adresse;
    public Landeshauptstadt(int einwohnerzahl, String name, String adresse){
        super(einwohnerzahl, name);
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
