package ans8;
//8. Write a Java program to create a class Employee with a method called
//calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
//override the calculateSalary() method to calculate and return the salary based on their
//specific roles.
public class Employee {
    public String name;
    public String role;

    public void Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void calculatesalary() {

    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Employee("Dhaval", "Manager");
    }
}

