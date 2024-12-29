package Story;
import Story.Character.Character;

import java.util.ArrayList;
import java.util.Objects;

public class Shirt {
    private final double endurance;
    public Shirt(double endurance, Character ... friends) throws Exception{
        if (endurance > 1 || endurance < 0){
            throw new IllegalArgumentException("Прочность от 0 до 1");
        }
        int i = 0;
        for (Character friend: friends){
            if (friend.getState() == State.Hanging){i++;}
        }

        Character[] needHelping = new Character[i];
        ArrayList<Character> rescuers = new ArrayList<>();

        i = 0;
        for (Character friend: friends){
            if (friend.getState() == State.Hanging){needHelping[i] = friend; i++; }
            else {rescuers.add(friend);}
        }

        for (Character rescuer: rescuers){
            rescuer.act(needHelping);
        }

        this.endurance = endurance;
    }

    public Heap catching(Character... charr){
        if (endurance < Math.random()){
            Sound tresk = new Sound("Треск");
            Sound stuk = new Sound("Стук");
            getSound(tresk, stuk);
            System.out.println(" рубашка порвалась");
            Heap heap = new Heap();
            heap.addToHeap(charr);
            return heap;
        }
        else {
            System.out.println("Тигра удачно спасён");
            return null;
        }
    }

    private void getSound(Sound ... sounds){
        System.out.print("Раздался ");
        for (Sound sound: sounds){
            System.out.print(sound.sound() + " ");
        }
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Shirt other = (Shirt) obj;
        return  (this.endurance == other.endurance);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(endurance);
    }
    @Override
    public String toString(){
        return  ("Shirt with endurance" + endurance);
    }
}
