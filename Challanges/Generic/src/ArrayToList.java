import java.awt.*;

public class ArrayToList<T>
{
    public T[] t;
    public void set(T[] t)
    {
        this.t = t;
    }
    public T[] get() {return t;}
    public T[] convertToList(T[] t)
    {
        set(t);
        this.get();
        return this.t;
    }
}
