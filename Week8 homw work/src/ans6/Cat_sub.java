package ans6;
//Write a Java program to create a base class Animal (Animal Family) with a method
//called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
//each subclass to make a specific sound for each animal.
public class Cat_sub extends Animal_family{
    public void sound(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat_sub a3= new Cat_sub();
        a3.sound();
    }
}
