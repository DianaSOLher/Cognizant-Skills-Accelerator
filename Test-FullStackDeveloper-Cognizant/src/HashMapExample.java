import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        //Add elements
        students.put(11, "Viridiana");
        students.put(234, "Misael");
        students.put(255, "Mireya");
        //print HashMap
        System.out.println("Students map: " + students);

        System.out.println(students.get(11));

        students.put(234, "Diana");
        System.out.println("Updated: " + students);

        students.remove(234);
        System.out.println("After remove: " + students);

        //iterate over keys
        for (Integer id : students.keySet()){
            System.out.println("Key: " + id);
        }
        //iterate over values
        for (String name : students.values()){
            System.out.println("Value: " +name);
        }

        //iterate over both
        for (Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //clear the hashmap
        students.clear();
        System.out.println("Students map: " + students);
        System.out.println("Is the hash map empty: " + students.isEmpty());
    }
}
