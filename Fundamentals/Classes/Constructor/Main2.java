package Fundamentals.Classes.Constructor;

public class Main2 {
    int x;

    public Main2(int y){ //int y parameter to the constructor
        x = y; //Inside the constructor we set x to y (x=y)
    }

    public static void main(String[] args) {
        Main2 obj = new Main2(3); /*When we call the constructor, we pass a parameter to the constructor (5), 
        which will set the value of x to 5*/
        System.out.println(obj.x); // Output is 3. 
    }
}
