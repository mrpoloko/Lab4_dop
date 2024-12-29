package Story.Character;

import Story.ObjectOfForest.Cone;

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
        Vinni youngVinni = new Vinni(getName(),getState());
        changeMood(Mood.Poetic);
        takeCone(new Cone());
        System.out.println(youngVinni.getName() + "  посмотрел на нее и сказал про себя: \"Это очень хорошая шишка, и, конечно, она должна с чем-нибудь рифмоваться\". Сперва он ничего не мог придумать, а потом ему вдруг пришла в голову рифма");
    }
    private void takeCone(Cone ... newCone){
        carryCones.addAll(Arrays.asList(newCone));
        System.out.println(getName() + "взял " + newCone.length + " шишек");
    }
}