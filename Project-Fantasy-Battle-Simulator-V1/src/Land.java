public class Land extends Entity{
    String land;

    //DEFAULT CONSTRUCTOR
    public Land(){
        land = "\u25A9\t";
    }

    //CONSTRUCTOR PARAMETERIZED
    public Land(String land, int row, int column){
        this.land = land;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return "\u25A9\t";
    }

}