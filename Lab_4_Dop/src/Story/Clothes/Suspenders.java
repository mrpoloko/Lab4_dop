package Story.Clothes;

public class Suspenders {
    private final String color;
    private final Quality quality;
    public Suspenders(String color, Quality quality){
        this.color = color;
        this.quality = quality;
    }

    public Quality getQuality() {
        return quality;
    }

    public String getColor(){
        return color;
    }
}
