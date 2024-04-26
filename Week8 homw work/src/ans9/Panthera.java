package ans9;
//Write a Java program to create a base class Animal with methods move() and
//makeSound(). Create two subclasses Bird and Panthera. Override the move() method
//in each subclass to describe how each animal moves. Also, override the makeSound()
//method in each subclass to make a specific sound for each animal.
public class Panthera extends Animal {
    public void move(){
        System.out.println(" Panthera walks on the ground");}
    public void makesound(){
        System.out.println(" Roars roars"); }

    public static void main(String[] args) {
        Panthera d3 = new Panthera();
        d3.move();
        d3.makesound();
    }
}
