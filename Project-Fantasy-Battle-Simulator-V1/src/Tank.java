import java.util.HashMap;

public class Tank extends Character{

    public Tank(String name, int health, int row, int column) {
        super.name = name;
        super.health = health;
        super.abilities = new HashMap<>();
        super.row = row;
        super.column = column;
    }
    public String toString(){
        return "\u26E8\t";
    }
}
