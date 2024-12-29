package Story.Character;

import Story.Clothes.*;

public class ChristopherRobin extends Character implements SeeingOnRiver {

    public ChristopherRobin(String name, State state){
        super(name,state);
    }
    @Override
    public void act() {
        System.out.print("Для спасения друзей ");
        System.out.println(getName() + " предложил натянуть рубашку");
        changeState(State.HoldingShirt);
    }
    public Suspenders takeOffShirt( String suspendersColor, Quality suspendersQuality){
        System.out.println(getName() +" снял рубашки и все увидили его подтяжки");
        return new Suspenders(suspendersColor, suspendersQuality);
    }
    public void seeingOnRiver(){
        System.out.println(getName() + "пожалуй, мог положить подбородок на верхнюю перекладину перил, если бы захотел: но гораздо интереснее было встать на нижнюю перекладину, наклониться пониже и смотреть на Реку, медленно скользившую куда-то");
        changeState(State.LookAtRiverOnBridgeStandung);
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
        return "ChristopherRobin{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}