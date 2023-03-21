package Fundamentals.Strings;

public class Strings {
    public static void main(String[] args) {
        /*
         * Arrays are used to store multiple values in a single variable, 
         * instead of declaring separate variables for each value.
         * To declare an array, define the variable type with square brackets
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] numbers = {1,2,3,4,5};

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(numbers[i]);
        }

        for (String s : cars){
            System.out.println(s);
        }

        int length = cars.length;
        System.out.println("Length of the array : " + length);


        /*
         * We can create multidimensional arrays
         * Multidimensional arrays are useful when you want to store data as a tabular form, 
         * like a table with rows and columns.
         */
        int[][] myNumbers = {{1,3,4,5}, {1,2,3,4}};
        System.out.println(myNumbers[2][3]);

        for (int i = 0 ; i < myNumbers.length ; i++){
            for (int j = 0 ; j < myNumbers[i].length ; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
