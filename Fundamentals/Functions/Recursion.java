package Fundamentals.Functions;

public class Recursion {
    /*
     * Recursion is the technique of making a function call itself. This technique 
     * provides a way to break complicated problems down into simple problems 
     * which are easier to solve.
     */

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Result is : " + result);    
    }

    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1); // Here is the recursion.
        } else {
            return 0;
        }
    }
}
