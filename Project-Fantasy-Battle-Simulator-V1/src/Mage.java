import java.util.HashMap;

public class Mage extends Character{
    public Mage(String name, int health, int row, int column) {
        super.name = name;
        super.health = health;
        super.abilities = new HashMap<>();
        super.row = row;
        super.column = column;
    }
    @Override

    public String toString(){
        return "\u2728\t";
    }

}
