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
}
