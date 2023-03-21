package Fundamentals.InnerClasses;

public class StaticInner {
    /*
     *  An inner class can also be static, 
     * which means that you can access it without creating an object of the outer class:
     */
    public static void main(String[] args) {
        Outer2.Inner2 myInner2 = new Outer2.Inner2();
        System.out.println(myInner2.y);
    }
}


class Outer2 {
    int x = 10;
    static class Inner2{
        int y = 3;
    }
}
