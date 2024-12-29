package Story.Clothes;
import Story.Character.Character;
import Story.ObjectOfForest.Heap;
import Story.ObjectOfForest.ShirtTorn;
import Story.ObjectOfForest.Sound;

import java.util.Arrays;
import java.util.Objects;

public class Shirt {
    private final double endurance;
    private final Character[] friends;
    private boolean full = true;
    public Shirt(double endurance, Character ... friends) throws Exception{
        if (endurance > 1 || endurance < 0){
            throw new RuntimeException("Прочность от 0 до 1");
        }
        this.friends = friends;

        for (Character rescuer: friends){
            rescuer.act();
        }

        this.endurance = endurance;
    }

    public Character[] getFriends() {
        return friends;
    }

    public boolean getFull(){
        return full;
    }

    public double getEndurance() {
        return endurance;
    }

    public Heap catching(Character charr) throws ShirtTorn {
        if (!full){
            throw new ShirtTorn("Рубашка уже порвана");
        }
        if (endurance < Math.random()){
            Sound tresk = new Sound("Треск");
            Sound stuk = new Sound("Стук");
            getSound(tresk, stuk);
            System.out.println(" рубашка порвалась");
            Heap heap = new Heap();
            for (Character character:friends){
                heap.addToHeap(character);
            }
            full = false;
            heap.addToHeap(charr);
            return heap;
        }
        else {
            System.out.println(charr.getName()+ " удачно спасён");
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shirt that = (Shirt) obj;
        return Double.compare(that.endurance, endurance) == 0 &&
                full == that.full &&
                Arrays.equals(friends, that.friends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(endurance, full);
        result = 31 * result + Arrays.hashCode(friends);
        return result;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "endurance=" + endurance +
                ", friends=" + Arrays.toString(friends) +
                ", full=" + full +
                '}';
    }
}
