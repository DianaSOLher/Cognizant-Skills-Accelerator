public class ConditionalsLogicalOperatorsSwitch {
    public static void main(String[] args) {
        // Declare three integer variables representing test scores and initialize them with a value between 0 and 100.
        int score1 = 23;
        int score2 = 15;
        int score3 = 99;

        //Declare an integer variable averageScore and initialize it to the average of the three test scores.
        int averageScore = (score1 + score2 + score3) / 3;

        //Use if-else statements to print a message based on the averageScore:
        //"Excellent" if averageScore is between 90 and 100.
        if (averageScore >= 90 && averageScore <= 100) {
            System.out.println("Excellent");
        }
        //"Good" if averageScore is between 70 and 89.
        else if (averageScore >= 70 && averageScore <= 89) {
            System.out.println("Good");
        }
        //"Average" if averageScore is between 50 and 69.
        else if (averageScore >= 50 && averageScore <= 69) {
            System.out.println("Good");
        }
        //"Poor" if averageScore is below 50.
        else {
            System.out.println("Poor");
        }

        //Create an integer variable day and initialize it with a value between 1 and 7.

        int day = 1;

        //Use a switch statement to print the name of the day based on the value of day (e.g., 1 for "Monday", 2 for "Tuesday", etc.).
        switch (day) {
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid Number");
            break;
        }
    }
}
