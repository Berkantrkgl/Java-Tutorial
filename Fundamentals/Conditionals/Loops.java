package Fundamentals.Conditionals;

public class Loops {
    /*
     * The do/while loop is a variant of the while loop.
     * This loop will execute the code block once, before checking if the condition is true, 
     * then it will repeat the loop as long as the condition is true.
     */
    class WhileLoops {
        public static void main(String[] args) {
            boolean condition = true;
            
            do {
                System.out.println("Condition is first time not important");
            } while (condition);
    
            //The while loop loops through a block of code as long as a specified condition is true:
    
            while (condition){
                System.out.println("Condition is important every time");
            }
        }
    }

    class ForLoops {
        public static void main(String[] args) {
            /*
             * When you know exactly how many times you want to loop through a block of code,     
             * use the for loop instead of a while loop    
             */  
            
            for (int i = 0 ; i < 10 ; i++){
                System.out.println("This for work 10 times");
            }

            for (int i = 0 ; i < 2 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    System.out.println("This work for 6 times"); // 2 x 3 = 6 times 
                }
            }

            for (int i = 0 ; i < 12 ; i = i +2){
                System.out.println("This loop work 6 times"); // 12 / 2 = 6 times
            }
            
            /*
             * There is also a "for-each" loop, 
             * which is used exclusively to loop through elements in an array
             */
            String[] cars = {"Volvo" , "BMW" , "Ford" , "Mazda"};
            for (String s : cars){
                System.out.println("Every single car is here to output : " + s);
            }

                
        }
    }
   
}
