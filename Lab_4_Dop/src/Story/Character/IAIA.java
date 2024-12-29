package Story.Character;

public class IAIA extends Character {
     public IAIA(String name, State state){
         super(name,state);
     }
    @Override
    public void act(){
        System.out.print("Чтоб помочь друзьям ");
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
        IAIA that = (IAIA) obj;
        return getName().equals(that.getName()) &&
                getState() == that.getState() &&
                getMood() == that.getMood();
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getMood().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IAIA{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}
