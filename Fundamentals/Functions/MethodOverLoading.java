package Fundamentals.Functions;

public class MethodOverLoading {
    /*
     * With method overloading, multiple methods 
     * can have the same name with different parameters
     */

    public static int plusMethod(int x, int y){
        return x + y;
    }

    public static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = plusMethod(2, 2);
        double num2 = plusMethod(2.3, 12.2);
        System.out.println("Integer summary : " + num1);
        System.out.println("Double summary : " + num2);
        

    }
}
