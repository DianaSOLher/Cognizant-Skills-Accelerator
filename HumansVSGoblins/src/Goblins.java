import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Goblins extends Entity{


    //DEFAULT CONSTRUCTOR -- not applicable

    //CONSTRUCTOR PARAMETERIZED
    public Goblins(int row, int column){
        super.row = row;
        super.column = column;
    }

    @Override
    public String toString(){
        return "\u2620\t";
    }

}
