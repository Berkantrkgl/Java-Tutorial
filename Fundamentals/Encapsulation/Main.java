package Fundamentals.Encapsulation;

public class Main {
    /*
     * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
     * To achieve this, you must
     * --- declare class variables/attributes as private
     * --- provide public get and set methods to access and update the value of a private variable
     */

     public static void main(String[] args) {
        Person person1 = new Person();

        person1.setAge(22);
        person1.setName("Berkan");

        System.out.println("Name of the Person : " + person1.getName());
        System.out.println("Age of the person : " + person1.getAge());
     }


}
