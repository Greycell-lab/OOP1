import java.util.Collections;

public class Musiker extends Manager{
    int id;
    public Musiker(){
        this.id = Manager.id;
        Collections.shuffle(Manager.instrumente);
        for(int i = 0;i<6;i++) this.musikerInstrumente.add(Manager.instrumente.get(i));
        Manager.id++;
        Manager.musiker.add(this);
    }
}
