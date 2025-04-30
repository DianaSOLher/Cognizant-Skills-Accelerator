import java.util.Scanner;

public class StudentGrades {
    public static void main (String[] args){
        //Declare an array to store the grades of 10 students.
        int[] grades = new int[10];
        //Use a Scanner object to allow the user to input grades.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input grades: ");
        //Write code to input grades from the user using a Scanner and store them in the array.
        int sum = 0;
        double averageGrade = 0;
        for (int i = 0; i < grades.length; i++){
            grades[i] = keyboard.nextInt();
            //Write code to calculate and print the average grade.
            sum += grades[i];
        }
        averageGrade = sum / 10;
        System.out.println("AVERAGE GRADE: " + averageGrade);
        //Write code to find and print the highest and lowest grades.
        int max = 0;
        int min = 0;
        for (int j = 0; j < grades.length; j++){
                if (grades[j] > max){
                    min = max;
                    max = grades[j];
                } else if(grades[j] < min){
                    min = grades[j];
                }
        }
        System.out.println("MAX:" + max);
        System.out.println("MIN:" + min);
        //Write code to display all the grades.
        System.out.println("ALL GRADES:");
        for (int grade : grades) {
            System.out.print(" " + grade);
        }
    }
}
