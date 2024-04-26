package ans8;
//8. Write a Java program to create a class Employee with a method called
//calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
//override the calculateSalary() method to calculate and return the salary based on their
//specific roles.
public class Manager extends Employee {
    public double basesalary;
    public double bonus;

    public void Manager(String name, double basesalary, double bonus){
             this.basesalary = basesalary;
             this.bonus = bonus;
    }
    public void calculatesalary() {
        double sal = basesalary + bonus;
        System.out.println("total " + sal);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.Manager("Vidhi",25000, 5000);
        m1.calculatesalary();
    }
}
