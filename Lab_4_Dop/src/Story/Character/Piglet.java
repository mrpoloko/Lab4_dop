package Story.Character;

import Story.Clothes.*;

public class Piglet extends Character implements Memoryly, SeeingOnRiver{
    private Character offend;
    public Piglet(String name, State state){
        super(name,state);
    }
    @Override
    public void act(){
        System.out.print("Чтоб помочь друзьям ");
        changeState(State.HoldingShirt);
    }
    public void offended(Character offended){
        this.offend = offended;
        System.out.println(getName() + " обиделся на " + offended.getName());
    }
    private void forgiveOffend(){
        System.out.println(getName() + " простил обиду " + offend.getName());
        offend = null;
    }
    public void justifyExpectation(Suspenders suspenders){
        if (suspenders.quality() == Quality.Good){
            System.out.println("Ожидание "+ getName() +" оправдались, они такие же " + suspenders.color() + " " + suspenders.quality());
            try {
                forgiveOffend();
            } catch (Exception _) {
                System.out.println(getName() + " Нинакого не обижался");
            }
        }
    }
    @Override
    public void memory(){
        changeMood(Mood.enthusiastic);
        System.out.println("    Но уважаемый " + getName() + " ничего не слышал из-за этого настроенния");
        Piglet youngPiglet = new Piglet( "молодой "+getName(), getState());
        System.out.println("    Воспоминание:");
        System.out.println("    " + youngPiglet.getName() + " увидел подтяжки");
        youngPiglet.changeMood(Mood.Excited);
        System.out.println("    причём настолько сильно, что его уложили спать на полчаса раньше обычного. И с тех пор он всегда мечтал проверить, действительно ли они такие голубые и такие помочные, как ему показалось. ");
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
        Piglet that = (Piglet) obj;
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
        return "Piglet{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}
