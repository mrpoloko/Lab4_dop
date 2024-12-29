package Story.Character;

import Story.State;

import java.util.Objects;

public abstract class Character {
    protected final String name;
    protected State state;

    public Character(String name, State state){
        this.name = name;
        this.state = state;
    }
    public void changeState(State newState){
        state = newState;
        System.out.println(name + " " + newState.getRusName());
    }
    public String getName(){
        return name;
    }
    public State getState(){
        return (state);
    }
    public abstract void act(Character ... needSaving);
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        return  (this.name.equals(other.name) && (this.state.equals(other.state)));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, state);
    }
    @Override
    public String toString(){
        return  this.name + this.state.toString();
    }
}

