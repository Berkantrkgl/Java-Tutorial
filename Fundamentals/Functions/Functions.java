package Fundamentals.Functions;

/**
 * A method is a block of code which only runs when it is called.
 * You can pass data, known as parameters, into a method.
 * Methods are used to perform certain actions, and they are also known as functions.
 * Why use methods? To reuse code: define the code once, and use it many times.
 */
public class Functions {

    /*
     * myMethod is name of the method
     * static means that the method belongs to the Functions class and not an object 
     * of the Functions class. 
     * void means that this method does not have a return value. 
     */
    static void myMethod() {
        System.out.println("Here is my method!!");
    }

   
    static void paramMethod(String name, int age){
        /*
        * Here is Parameters act as variables within the function. 
        * One or more parameters are specified in the parenthesis after the function name.
        */
        System.out.println("Hosgeldiniz " + name);
        System.out.println("Your age is : " + age);
    }

    static int returnFunc(int num1, int num2){
        /*
         * In return functions, we write a primitive variable name instead of void. 
         * And the variable that is wanted to be returned in 
         * the function is returned by writing it after return.
         */
        int sum = num1 + num2;
        return sum;
    }

    public static void checkAge(int age){
        if (age > 18){
            System.out.println("Your age is over 18");
        } else {
            System.out.println("You are not underage");
        }
    }
    
    
    public static void main(String[] args) {
        myMethod(); // To call a method, write method's full name and add parantheses.
        int result = returnFunc(2, 3);
        paramMethod("Berkan", 12);
        System.out.println("Summary of the number : " + result);
        checkAge(result);

    }
    
}