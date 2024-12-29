package Story.Character;


public class Tiger extends Character implements Jumply {
    public Tiger(String name, State state){
        super(name,state);
        act();
    }
    @Override
    public void jump(){
        changeMood(Mood.bad);
        System.out.println(getName() + "изо всей силы держался за ветку и говорил про себя: \"Конечно, прыгающим животным, вроде Кенги, это хорошо, но для плавающих животных, вроде Тигров, это совершенно другое дело\". И он почему-то вдруг представил себе, как он плывет на спинке вниз по течению или весело ныряет в прохладной влаге реки, и почувствовал, что это и есть настоящая жизнь для Тигры. ");
        changeMood(Mood.Good);
        System.out.println(getName() + "почувствовал, как это просто.");
        System.out.println(getName() + " решился прыгнуть");
        this.changeState(State.Falling);
    }
    @Override
    public void act() {
        System.out.println(getName() + " решил взабратся на дереве и не может слезть");
        super.changeState(State.Hanging);
    }
    @Override
    public void beCatching(){
        changeMood(Mood.Excited);
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
        return "Tiger{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}
