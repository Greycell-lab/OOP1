public class Auto {
    private int id;
    private String marke;
    private Person besitzer;
    public Auto(int id, String marke, Person besitzer){
        this.id = id;
        this.marke = marke;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setMarke(String marke){
        this.marke = marke;
    }



}
