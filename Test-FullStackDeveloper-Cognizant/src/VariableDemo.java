import java.sql.SQLOutput;

public class VariableDemo {
    public static void  main(String[] args){
        int b = 100;
        double c = b;
        System.out.println(c);

        long largerNum = 1120L;
        int smaller = (int) largerNum;

        System.out.println(smaller);

        String escapeExample = "This is a \"quote\" and a new line:\nSecond line.";
        System.out.println(escapeExample);

        String greeting = "Hello Java";
        System.out.println("Greeting: " + greeting);

        String firstName = "VIRIDIANA";
        String lastName = "SOLIS";
        String fullName = firstName + " " +  lastName;
        System.out.println(fullName);

        String hello = "Hello, ";
        String world = "World";
        String combined = hello.concat(world);
        System.out.println(combined);

        String message = "Java is powerfull";
        System.out.println(message.length());

        String sentence = "Programming is fun";
        String fragment = sentence.substring(0,11);
        System.out.println(fragment);

        String str1 = "Java";
        String str2 = "java";
        boolean comparison = str1.equals(str2);
        System.out.println(comparison);

        boolean comparison2 = str1.equalsIgnoreCase(str2);
        System.out.println(comparison2);

        String escapeExample2 = "This is a \"quote\" and a new line:\nSecond line.";
        System.out.println(escapeExample);

        int month = 1;

        switch (month) {
            case 1:
            case 3:
            case 5:
                System.out.println("This month has 31 days.");
                break;
            case 4:
            case 6:
                System.out.println("This month has 30 days.");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days.");
                break;
// ... other cases
            default:
                System.out.println("Invalid month");
        }
        String fruit = "apple";
        char fruit2 = 'a';
        switch (fruit2) {
            case 'a':
                System.out.println("It's a delicious apple.");
                break;
            case 'b':
                System.out.println("It's a juicy orange.");
                break;
// ... other cases
            default:
                System.out.println("Unknown fruit");
        }
    }
}
