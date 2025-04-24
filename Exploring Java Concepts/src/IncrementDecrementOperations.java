public class IncrementDecrementOperations {
    public static void main(String[] args){
        /* Declare and Initialize Variables:
Declare an integer variable counter and initialize it with the value 10.
*/
        int counter = 10;
/*
Perform Increment and Decrement Operations:

Increment the value of counter by 1 using the increment operator (++).
Print the value of counter.
*/
        counter++;
        System.out.println("COUNTER++ " + counter);

        /*
Decrement the value of counter by 1 using the decrement operator (--).
Print the value of counter.
*/
        counter--;
        System.out.println("COUNTER--" + counter);

        /*
        Use Increment and Decrement in Loops:

Use a for loop to increment counter from 10 to 15 and print each value.
*/
        for (int i = 10; i<=15; i++){
            System.out.println(i);
        }
/*
Use a while loop to decrement counter from 15 to 10 and print each value.
        * */
        int j = 15;
        while (j>=10){
            System.out.println(j);
            j--;
        }

    }
}
