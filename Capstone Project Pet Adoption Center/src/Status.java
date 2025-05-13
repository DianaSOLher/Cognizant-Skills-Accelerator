public enum Status {
    NOT_ADOPTED("Not Adopted"),
    IN_PROGRESS("In Progress"),
    ADOPTED("Adopted");

    private final String label;

    Status(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
