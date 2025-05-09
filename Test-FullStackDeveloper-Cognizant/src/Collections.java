import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        //Add elements to ArrayList
        students.add("Viridiana");
        students.add("Mireya");
        students.add("Misael");
        students.add("Alfonso");

        System.out.println("Students list: " + students);

        System.out.println("FIRST STUDENT: " + students.get(0));

        students.set(0,"Diana");
        System.out.println("UPDATED: " +students);

        students.remove(0);
        students.remove("Mireya");
        System.out.println("UPDATED: " +students);

        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
        //FOR EACH
        for (String student : students){
            System.out.println(student);
        }

    }
}
