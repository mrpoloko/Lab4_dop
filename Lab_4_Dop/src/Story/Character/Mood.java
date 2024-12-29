package Story.Character;

public enum Mood {
    Good("хорошее"),
    enthusiastic("взволнованное"),
    bad("плохое"),
    Excited("возбуждённ"),
    Poetic("поэтичное");

    private final String rusName;
    Mood(String rusName) {
        this.rusName = rusName;
    }
    public String getRusName(){
        return (rusName + " настроение");
    }
}

