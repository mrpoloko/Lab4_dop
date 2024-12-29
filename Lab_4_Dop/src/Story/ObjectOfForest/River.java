package Story.ObjectOfForest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class River {
    private ArrayList<Object> objInRiver = new ArrayList<>();
    private ArrayList<Object> objUnderBridge = new ArrayList<>();
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
    public void addObjInRiver(Object ... objInRivers) {
        objInRiver.addAll(Arrays.asList(objInRivers));
        for (Object obj: objInRivers) {
            System.out.println(obj.toString() + " в реке");
        }
    }
    public void addObjUnderBridge(Object ... objInRivers) {
        for (Object obj: objInRivers){
            if (objInRiver.contains(obj)){
                System.out.println(obj.toString() + " заплыл под мост");
                objUnderBridge.add(obj);
                objInRiver.remove(obj);
            }
            else {
                System.out.println(obj.toString() + " бросили под мост");
                objUnderBridge.add(obj);
            }
        }
    }
    public void delObjUnderBridge(Object ... objInRivers) {
        objUnderBridge.removeAll(Arrays.asList(objInRivers));
        for (Object obj: objInRivers){
            System.out.println(obj.toString() + " выплыл из под мост");
            objInRiver.add(obj);
        }
    }

    public ArrayList<Object> getObjInRiver() {
        return objInRiver;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        River that = (River) obj;
        return fullRiver == that.fullRiver &&
                Objects.equals(objInRiver, that.objInRiver) &&
                Objects.equals(objUnderBridge, that.objUnderBridge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objInRiver, objUnderBridge, fullRiver);
    }

    @Override
    public String toString() {
        return "River{" +
                "objInRiver=" + objInRiver +
                ", objUnderBridge=" + objUnderBridge +
                ", fullRiver=" + fullRiver +
                '}';
    }
}
