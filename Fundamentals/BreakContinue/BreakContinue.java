package Fundamentals.BreakContinue;

public class BreakContinue {
    /*
     * The break statement can also be used to jump out of a loop.
     */
    class Break {
        public static void main(String[] args) {
            for (int i = 0 ; i < 5 ; i++){
                if (i == 4){
                    break;
                }
                System.out.println(i); // Output is 0,1,2,3
            }
    
            
            
        }
    }

    /*
     * The continue statement breaks one iteration (in the loop), 
     * if a specified condition occurs, and continues with the next iteration in the loop.
     */

    class Continue {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                if (i == 4) {
                  continue;
                }
                System.out.println(i); // Here output is : 0,1,2,3,5
              }
        }
    }

    
}
