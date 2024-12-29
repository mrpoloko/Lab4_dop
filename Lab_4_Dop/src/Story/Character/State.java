package Story.Character;

public enum State {
    Standing("Поднялся"),
    OnEarth("Упал на землю"),
    Falling("Падает"),
    Hanging("Висит"), //Висеть
    Onbridge("защёл на мост"),
    LookAtRiverOnBridgeOnEarth("Смотрит на реку лёжа, с моста"),
    LookAtRiverOnBridgeStandung("Смотрит на реку стоя, с моста"),
    HoldingShirt("взялись за рубашку");

    private final String rusName;
    State(String rusName) {
        this.rusName = rusName;
    }
    public String getRusName(){
        return rusName;
    }
}
