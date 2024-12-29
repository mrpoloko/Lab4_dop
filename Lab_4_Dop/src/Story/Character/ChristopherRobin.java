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
    public void takeOffShirt(Piglet pig, String suspendersColor, Quality suspendersQuality){
        System.out.println(getName() +" снял рубашки и все увидили его подтяжки");
        Suspenders suspenders = new Suspenders(suspendersColor, suspendersQuality);
        pig.justifyExpectation(suspenders);
    }
    public void seeingOnRiver(){
        System.out.println(getName() + "пожалуй, мог положить подбородок на верхнюю перекладину перил, если бы захотел: но гораздо интереснее было встать на нижнюю перекладину, наклониться пониже и смотреть на Реку, медленно скользившую куда-то");
        changeState(State.LookAtRiverOnBridgeStandung);
    }
}