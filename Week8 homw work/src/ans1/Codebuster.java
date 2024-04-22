package ans1;
//1. Write a Java program to create a class called codebuster with a method called
//groupName(). Create a subclass called codebusterGroups() that overrides the
//groupName() method.
public class Codebuster {

    public void groupname (){
        System.out.println("java");
    }

    public static void main(String[] args) {
        Codebuster name = new Codebuster();
        name.groupname();
    }
}
