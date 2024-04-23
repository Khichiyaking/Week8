package ans4;
//Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.
public class Animal {
    public void move(){
        System.out.println("Tiger moves");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();
    }

}
