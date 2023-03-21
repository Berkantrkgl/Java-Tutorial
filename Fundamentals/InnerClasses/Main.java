package Fundamentals.InnerClasses;

public class Main {
    /*
     * In Java, it is also possible to nest classes (a class within a class). 
     * The purpose of nested classes is to group classes that belong together, 
     * which makes your code more readable and maintainable.
     */

    /*
     * To access the inner class, 
     * create an object of the outer class, 
     * and then create an object of the inner class:
     */
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();

        System.out.println("Inner Variable : " + myInnerClass.innerVariable + 
        "|| Outer Variable : " + myOuterClass.outerVariable);
    }

}

class OuterClass {
    int outerVariable = 10;
    class InnerClass {
        int innerVariable = 3;
    }
}
