public enum WaterType {
    FRESHWATER("Fresh water"),
    SALTWATER("Salt water");

    private final String label;

    WaterType(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
