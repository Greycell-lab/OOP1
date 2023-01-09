package Robot;

import java.util.ArrayList;

public class Robot {
    public static ArrayList<Robot> robots = new ArrayList<>();
    public Robot(){
        robots.add(this);
    }
    String name;
    boolean isHostile;
}
