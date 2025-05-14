public enum Status {
    NOT_ADOPTED("Not Adopted"),
    ADOPTED("Adopted");

    private final String label;

    Status(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
