package Fundamentals.Conditionals;

public class Conditional {
    /*
     * You already know that Java supports the usual logical conditions from mathematics:
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b
     */
    public static void main(String[] args) {
        /*
         * Java has the following conditional statements:
            Use if to specify a block of code to be executed, if a specified condition is true
            Use else to specify a block of code to be executed, if the same condition is false
            Use else if to specify a new condition to test, if the first condition is false
            Use switch to specify many alternative blocks of code to be executed
         */

        boolean myCondition = true; //In the example below, we test two values to find out if 20 is greater than 18. 
        //If the condition is true, print some text.
        if (myCondition){
            System.out.println("My Condition is true!");
        }
        if (20 > 15){
            System.out.println("This condition is also true!");
        }

        boolean myFalseCondition = false; //Use the else statement to specify a block of code to be executed if the condition is false.
        if (myFalseCondition){
            System.out.println("Here is true condition");   
        } else {
            System.out.println("If condition is false, we are here !");
        }

        boolean condition1 = false;
        boolean condition2 = false;
        // Here we use a different type of if/else style
        if (condition1) System.out.println("Good Morning"); // We can make multiple conditions.
        else if (condition2) System.out.println("Good day");
        else System.out.println("Good evening");


        //variable = (condition) ? expressionTrue :  expressionFalse;

        int time = 20;
        String result = (time < 20 ) ? "Hello" : "Hi";
        System.out.println(result);
    }
}

class Switching {
    /*
     * Instead of writing many if..else statements, you can use the switch statement.
        The switch statement selects one of many code blocks to be executed/
     */

    public static void main(String[] args) {
        int number = 4;
        switch (number){
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4: 
                System.out.println("Number is 4 and true");
                break;
            default:
                System.out.println("Number is not here");
                break;
        }
    }
}
