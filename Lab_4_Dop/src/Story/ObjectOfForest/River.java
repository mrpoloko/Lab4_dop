package Story.ObjectOfForest;

import java.util.ArrayList;
import java.util.Objects;

public class River {
    private ArrayList<Objects> objInRiver;
    private boolean fullRiver = false;
    public River(){
        System.out.println("Речка текла по вему Лесу");
        System.out.println("сделавшись взрослой, речка перестала прыгать, скакать и вертеться, как вначале, в детстве, а двигалась плавно и медленно");
    }
    public void aboutStreams(){
        System.out.println(" Зато все впадавшие в нее маленькие ручейки носились по Лесу взад и вперед без устали, мелькали то тут, то там-- ведь им надо было так много, так много увидеть и узнать!");
    }
    public void getToEdge(){
        System.out.println("К тому времени, когда речка добралась до края Леса. она очень выросла-- выросла в настоящую Реку.");
        fullRiver = true;
        System.out.println("сделавшись взрослой, речка перестала прыгать, скакать и вертеться, как вначале, в детстве, а двигалась плавно и медленно");
    }
    public boolean getFullRiver(){
        return fullRiver;
    }
}
