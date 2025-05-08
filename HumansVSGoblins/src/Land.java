public class Land extends Entity{
    String land;

    //DEFAULT CONSTRUCTOR
    public Land(){
        land = "\u25A9\t";
    }

    //CONSTRUCTOR PARAMETERIZED
    public Land(String land){
        this.land = land;
    }

    @Override
    public String toString(){
        return "\u25A9\t";
    }

    //METHODS

}
