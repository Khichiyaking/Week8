package ans6;
//Write a Java program to create a base class Animal (Animal Family) with a method
//called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
//each subclass to make a specific sound for each animal.
public class Bird_sub extends Animal_family {
    public void sound(){
        System.out.println("chi chi");
    }

    public static void main(String[] args) {
        Bird_sub a2= new Bird_sub();
        a2.sound();
    }
}
