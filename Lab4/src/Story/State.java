package Story;

public enum State {
    Standing("Поднялся"),
    OnEarth("Упал на землю"),
    Falling("Падает"),
    Hanging("Висит"), //Висеть
    HoldingShirt("взялись за рубашку");

    private final String rusName;
    State(String rusName) {
        this.rusName = rusName;
    }
    public String getRusName(){
        return rusName;
    }
}
