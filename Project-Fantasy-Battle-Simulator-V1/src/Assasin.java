import java.util.HashMap;

public class Assasin extends Character{

    public Assasin(String name, int health, int row, int column) {
        super.name = name;
        super.health = health;
        super.abilities = new HashMap<>();
        super.row = row;
        super.column = column;
    }

    public String toString(){
        return "\u2694\t";
    }
}
