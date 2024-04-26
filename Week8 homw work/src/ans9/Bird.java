package ans9;
//Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera. Override the move() method
//in each subclass to describe how each animal moves. Also, override the makeSound()
//method in each subclass to make a specific sound for each animal.
public class Bird extends Animal{

    public void move(){
        System.out.println("Duck");}
    public void makesound(){
        System.out.println("Quack quack"); }

    public static void main(String[] args) {
        Bird d2 = new Bird();
        d2.move();
        d2.makesound();
    }
}
