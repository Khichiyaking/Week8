package ans2;
//2. Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a
//car".
public class Car extends Vehicle{

    public void driver(){
        System.out.println("Reparing a car");
    }

    public static void main(String[] args) {
        Car a1 = new Car();
        //  a1.driver1();
        a1.driver();
    }


}
