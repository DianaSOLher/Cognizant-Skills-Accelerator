public class Arrays {
    public static void main(String[] args){
        //Declare and initialize an array of 5 double values. Assign values to each element and print them.
        double[] arrayDoubles = { 12.12, 32.55, 79.33, 1.55, 6.99};
        System.out.println("ARRAY DOUBLES");
        for (double doub : arrayDoubles){
            System.out.print(doub + " ");
        }
        // Create an array of 5 integers.
        //Initialize the array with values.
        int[] arrayInt = {1,2,3,4,5};
        //Update the third element to a new value.
        arrayInt[2] = 77;
        //Print all elements of the array.
        System.out.println("\nARRAY INTEGERS");
        for(int entero : arrayInt){
            System.out.print(entero + " ");
        }
        System.out.println("\nMultiples 3:");
        //Create an array of 10 integers.
        int[] array3 = new int[10];
        //Fill the array with multiples of 3
        //Print the length of the array and all its elements.
        System.out.println("Lenght: " + array3.length);
        for (int i= 0; i < array3.length; i++){
            array3[i] = i * 3;
            System.out.print(array3[i] + " ");
        }


    }
}
