package ans11;
//Write a Java program to create a class called Person with private instance variables
//name, age. and country. Provide public getter and setter methods to access and modify
//these variables.
public class Person {
    private String name;
    private int age;
    private String country;

    public Person(){
        this.name="Dhaval";
        this.age = 32;
        this.country = "London";
    }
    public Person(String name, int age, String country){
        this.name = name;
        this.age = age;
    }
}
