package Fundamentals.Threads;
/*
 * Threads allows a program to operate more efficiently by 
 * doing multiple things at the same time.
 * Threads can be used to perform complicated tasks in 
 * the background without interrupting the main program.
 */
public class Main extends Thread{
    /*
     * There are two ways to create a thread.
     * It can be created by extending the Thread class and overriding its run() method
     */
    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    
}

class Main2 implements Runnable {

    public static void main(String[] args) {
        Main2 obj = new Main2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is oustside of the thread");
    }

     @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }

}


class Main3 extends Thread {
    /*
     * Because threads run at the same time as other parts of the program, 
     * there is no way to know in which order the code will run. 
     * When the threads and main program are reading and writing the same variables, 
     * the values are unpredictable. 
     * The problems that result from this are called concurrency problems.
     */
    public static int amount = 0;

    public static void main(String[] args) {
        /*
         * To avoid concurrency problems, it is best to share as few attributes 
         * between threads as possible. If attributes need to be shared, 
         * one possible solution is to use the isAlive() method of the thread 
         * to check whether the thread has finished running before using any 
         * attributes that the thread can change.
         */
        Main thread = new Main();
        thread.start(); 
        // Wait for the thread to finish       
        while(thread.isAlive()) {    
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
  
    }

    public void run() {
        amount++;
    }
}
