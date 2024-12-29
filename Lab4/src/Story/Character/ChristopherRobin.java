package Story.Character;

import Story.State;

public class ChristopherRobin extends Character {
    public ChristopherRobin(String name, State state){
        super(name,state);
    }

    @Override
    public void act(Character ... needSaving) {
        System.out.print("Для спасения ");
        for (Character character: needSaving) {
            System.out.print(character.getName() + " ");
        }
        System.out.println(getName() + " предложил натянуть рубашку");
        changeState(State.HoldingShirt);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChristopherRobin that = (ChristopherRobin) obj;
        return getName().equals(that.getName()) && getState() == that.getState();
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getState().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ChristopherRobin{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                '}';
    }
}