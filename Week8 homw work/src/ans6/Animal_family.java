package ans6;
//6.Write a Java program to create a base class Animal (Animal Family) with a method
//called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
//each subclass to make a specific sound for each animal.
public class Animal_family {

    public void sound(){
        System.out.println("General sound");
    }
    public static void main(String[] args) {
        Animal_family a1= new Animal_family();
        a1.sound();
    }
}
