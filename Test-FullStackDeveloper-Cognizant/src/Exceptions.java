public class Exceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        /*
        try {
            System.out.println("RESULT: " + (a/b));
        }catch (ArithmeticException e){
            System.out.println("Error: Can not divide by zero");
        }
        */
        try {
            int result = 10 /2;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e ){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Execution completed");
        }

    }
}
