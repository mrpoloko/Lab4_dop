package Story.Character;

import Story.ObjectOfForest.Cone;
import Story.ObjectOfForest.River;

import java.util.ArrayList;
import java.util.Arrays;

public class Vinni extends Character implements SeeingOnRiver, Memoryly{
    public Vinni(String name, State state){
        super(name,state);
    }
    ArrayList<Cone> carryCones = new ArrayList<>();
    @Override
    public void act(){
        System.out.print("Чтоб помочь друзьям ");
        changeState(State.HoldingShirt);
    }
    @Override
    public void seeingOnRiver(){
        System.out.println(getName() + " если бы захотел, пожалуй, мог положить свой подбородок на нижнюю перекладину, но куда интереснее было лечь на животик, просунуть голову под перекладину и смотреть, как внизу медленно скользит Река.");
        changeState(State.LookAtRiverOnBridgeOnEarth);
    }
    @Override
    public void memory(){
        System.out.println("Воспоминание:");
        System.out.print("    ");
        changeMood(Mood.Poetic);
        System.out.print("     ");
        takeCone(new Cone());
        System.out.println("    " + getName() + " посмотрел на нее и сказал про себя: \"Это очень хорошая шишка, и, конечно, она должна с чем-нибудь рифмоваться\". Сперва он ничего не мог придумать, а потом ему вдруг пришла в голову рифма");
    }
    private void takeCone(Cone ... newCone){
        carryCones.addAll(Arrays.asList(newCone));
        System.out.println(getName() + " взял " + newCone.length + " шишек");
    }
    private void lookObjInRiver(River river){
        System.out.println(getName() + " смотрит в реку");
        river.getObjInRiver().forEach(objects -> {
            System.out.println("Увидел в реке " + objects.toString());
        });
    }
    public void memoryWithRiver(River river){
        memory();
        Cone cone1 = new Cone();
        river.addObjInRiver(cone1);
        river.addObjUnderBridge(cone1);
        river.delObjUnderBridge(cone1);
        lookObjInRiver(river);
        System.out.println("Конец воспоминаний");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vinni that = (Vinni) obj;
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
        return "Vinni{" +
                "name='" + getName() + '\'' +
                ", state=" + getState() +
                ", mood=" + getMood() +
                '}';
    }
}