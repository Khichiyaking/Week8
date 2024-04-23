package ans4;
//Write a Java program to create a class called Animal with a method named move().
//Create a subclass called Cheetah that overrides the move() method to run.
public class Cheetah extends Animal{
    public void move() {
        System.out.println("cheetah run");
    }


    public static void main(String[] args) {
        Cheetah a2 =new Cheetah();
        a2.move();
        Animal a1 = new Animal();
        a1.move();
    }
}