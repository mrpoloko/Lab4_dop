package Story.ObjectOfForest;

public enum Width {
    Wide("Широкая"),
    Narrow("Узкая");
    private final String rusName;
    Width(String rusName) {
        this.rusName = rusName;
    }
    public String getRusName(){
        return (rusName);
    }
}
