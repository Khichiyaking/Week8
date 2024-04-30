package ans13;
//Write a Java program to create a class called Employee with private instance variables
//employee_id, employee_name, and employee_salary. Provide public getter and setter
//methods to access and modify the id and name variables, but provide a getter method
//for the salary variable that returns a formatted string.
public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee (int employee_id1, String employee_name1, double employee_salary1){
        this.employee_id = employee_id1;
        this.employee_name = employee_name1;
        this.employee_salary = employee_salary1;
    }
    public int getEmployee_id(){
        return employee_id;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public String getEmployee_salary(){
        return String.format("£%.2f",employee_salary);
    }
    //setter method

    public void setEmployee_id(int employee_id2){
        this.employee_id = employee_id2;
    }
    public void setEmployee_name(String employee_name2){
        this.employee_name = employee_name2;
    }
    public void setEmployee_salary (double employee_salary2){
        this.employee_salary= employee_salary2;
    }
    public static void main(String[] args) {
     Employee jober = new Employee(989, "Dhaval", 51000);

        System.out.println("Employee Id :" +jober.getEmployee_id());
        System.out.println("Employee name :" + jober.getEmployee_name());
        System.out.println("Employee salary :" + jober.getEmployee_salary());
    }
}
