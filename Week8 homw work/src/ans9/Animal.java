package ans9;
//Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera. Override the move() method
//in each subclass to describe how each animal moves. Also, override the makeSound()
//method in each subclass to make a specific sound for each animal.
public class Animal {

    public void move(){
        System.out.println ("Dog");}
    public void makesound(){
        System.out.println("Woof woof");}


    public static void main(String[] args) {
        Animal d1 = new Animal();
        d1.makesound();
        d1.move();
    }


}
