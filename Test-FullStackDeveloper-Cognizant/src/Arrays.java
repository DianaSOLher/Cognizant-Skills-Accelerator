public class Arrays {
    public static void main(String[] args){
        System.out.println("Accessing");
        int[] testScores = {89,94,56,78,13};
        System.out.println("FIRST ELEMENT: "+testScores[0]);
        System.out.println("THIRD ELEMENT: "+testScores[2]);

        System.out.println("Modifyin array elements");
        testScores[2] =40;

        System.out.println("for loop");
        for (int i =1; i< testScores.length; i++){
            System.out.println("testScores["+i+"]: "+testScores[i]);
        }

        System.out.println("modify with foor loop");

        for (int i =1; i< testScores.length; i++){
            testScores[i] +=i;
            System.out.println("testScores["+i+"]: "+testScores[i]);
        }

        int[][] array = new int[3][4];
        int[][] staticArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(staticArray[0][1]);
        System.out.println(staticArray[2][3]);

        staticArray[1][2] = 99;
        System.out.println(staticArray[1][2]);

        System.out.println("Traversing array");
        for (int i = 0; i < staticArray.length; i++){
            for (int j = 0; j< staticArray[i].length; j++){
                System.out.print(staticArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
