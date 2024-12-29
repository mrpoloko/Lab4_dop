package Story.Character;

import Story.Jumply;
import Story.State;


public class Tiger extends Character implements Jumply {
    public Tiger(String name, State state){
        super(name,state);
    }
    @Override
    public void jump(){
        System.out.println(getName() + " решился прыгнуть");
        this.changeState(State.Falling);
    }
    @Override
    public void act(Character ... needSaving) {
        System.out.println(getName() + " решил взабратся на дереве и не может слезть");
        super.changeState(State.Hanging);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tiger that = (Tiger) obj;
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
