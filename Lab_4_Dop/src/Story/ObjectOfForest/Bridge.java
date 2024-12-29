package Story.ObjectOfForest;


import Story.Character.Character;
import Story.Character.State;

import java.util.ArrayList;
import java.util.Arrays;

public class Bridge {
    private final Width width;
    private ArrayList<Character> onBridge = new ArrayList<>();
    public Bridge(Width width){
        this.width = width;
    }
    public void addOnBridge(Character ... characters){
        onBridge.addAll(Arrays.asList(characters));
        onBridge.forEach(character -> {character.changeState(State.Onbridge);});
    }
    public void delOnBridge(Character ... characters){
        onBridge.removeAll(Arrays.asList(characters));
        onBridge.forEach(character -> {character.changeState(State.Standing); System.out.println(character.getName() + " сощёл с моста");});
    }

    public ArrayList<Character> getOnBridge() {
        return onBridge;
    }

    public Width getWidth() {
        return width;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bridge that = (Bridge) obj;
        return width == that.width && getOnBridge().equals(that.getOnBridge());
    }

    @Override
    public int hashCode() {
        return getWidth().hashCode() + getOnBridge().hashCode();
    }

    @Override
    public String toString() {
        return "Bridge{" + "width=" + width + ", onBridge=" + onBridge + "}";
    }
}

