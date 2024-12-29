package Story.Character;

public abstract class Character {
    private final String name;
    private State state;
    private Mood mood = Mood.Good;

    public Character(String name, State state){
        this.name = name;
        this.state = state;
    }
    public void changeState(State newState){
        state = newState;
        System.out.println(name + " " + this.state.getRusName());
    }
    public void changeMood(Mood mood){
        this.mood = mood;
        System.out.println(name + " " + this.mood.getRusName());
    }
    public String getName(){
        return name;
    }
    public State getState(){
        return (state);
    }
    public Mood getMood(){return (mood);}
    public abstract void act();
}

