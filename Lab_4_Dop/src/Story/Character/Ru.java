package Story.Character;

public class Ru extends Character implements Jumply, SeeingOnRiver {
    public Ru(String name, State state){
        super(name,state);
        act();
    }

    @Override
    public void jump(){
        changeMood(Mood.enthusiastic);
        System.out.println("  Когда понял, что ему нужно сделать");
        System.out.println(getName() + " решился прыгнуть");
        this.changeState(State.Falling);
        System.out.println("Летел он так быстро, что его снова подбросило почти на такую же высоту и он еще долго продолжал подлетать вверх, приговаривая: \"О, о!\"");
    }
    @Override
    public void act() {
        System.out.println(getName() + " решил взабратся на дереве и не может слезть");
        super.changeState(State.Hanging);
    }
    @Override
    public void beCatching(){
        System.out.println("Ой, как здорово!");
        changeMood(Mood.Good);
    }
    @Override
    public void seeingOnRiver(){
        System.out.println("Для " + getName() + " единственный способ полюбоваться Рекой, потому что они были такие маленькие, что никак не доставали даже до нижней перекладины");
        changeState(State.LookAtRiverOnBridgeOnEarth);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ru that = (Ru) obj;
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
        return "Ru{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}
