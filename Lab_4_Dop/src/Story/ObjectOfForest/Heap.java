package Story.ObjectOfForest;

import Story.Character.Character;
import Story.Character.State;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Character> heap = new ArrayList<Character>();

    public Heap() {
        System.out.println("образовалась куча-мала");
    }

    public void addToHeap(Character charr) {
        heap.add(charr);
        charr.changeState(State.OnEarth);
    }
    public void rise(Character character) {
        heap.remove(character);
        System.out.println(character.getName()+ "поднялся");
        character.changeState(State.Standing);
    }
    public void riseAll(){
        heap.forEach(character -> {character.changeState(State.Standing);});
        heap.removeAll(heap);
    }
}

