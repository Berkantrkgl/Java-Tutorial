package Fundamentals.Classes.Objects;

public class Attributes {
    int accesAttribut = 10;
    int modify;
    final int stabil = 15; //If you don't want the ability to override existing values, declare the attribute as final

    /*
     * The following example will create an object 
     * of the Main class, with the name myObj. 
     * We use the x attribute on the object to print its value
     */
    public static void main(String[] args) {
        Attributes obj = new Attributes();
        System.out.println(obj.accesAttribut);

        obj.modify = 20; // You can also modify attribute values
        System.out.println(obj.modify);

        obj.accesAttribut = 11; // override existing values

        Attributes obj2 = new Attributes();
        obj2.accesAttribut = 100; //If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other
        System.out.println(obj.accesAttribut); 
        System.out.println(obj2.accesAttribut);

        System.out.println("The attributes of object : " + obj.accesAttribut + " ," + obj.modify + " , " + obj.stabil); // You can specify as many attributes as you want


        
    }
}
