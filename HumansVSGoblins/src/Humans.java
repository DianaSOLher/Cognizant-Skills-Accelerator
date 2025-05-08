public class Humans extends Entity{

    //DEFAULT CONSTRUCTOR -- not applicable

    //CONSTRUCTOR PARAMETERIZED
    public Humans(int row, int column){
        super.row = row;
        super.column = column;
    }



    @Override
    public String toString(){
        return "\u2655\t";
    }
}
