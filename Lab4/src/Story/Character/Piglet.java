package Story.Character;

import Story.State;

public class Piglet extends Character{
    public Piglet(String name, State state){
        super(name,state);
    }
    @Override
    public void act(Character ... needSaving){
        System.out.print("Чтоб помочь друзьям ");
        for (Character character: needSaving) {
            System.out.print(character.getName() + " ");
        }
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
        Piglet that = (Piglet) obj;
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
