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
        onBridge.forEach(character -> {character.changeState(State.Onbridge);});
    }

    public Width getWidth() {
        return width;
    }
}
