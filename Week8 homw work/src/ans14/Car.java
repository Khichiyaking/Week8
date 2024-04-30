package ans14;
//Write a Java program to create a class called Car with private instance variables
//company_name, model_name, year, and mileage. Provide public getter and setter
//methods to access and modify the company_name, model_name, and year variables.
//However, only provide a getter method for the mileage variable.
public class Car {
    private String companyname;
    private String modelname;
    private int year;
    private double mileage;
    public Car(String companyname2,String modelname2,int year2,double mileage2){
        this.companyname = companyname2;
        this.modelname = modelname2;
        this.year = year2;
        this.mileage =mileage2;
    }
    public double getMileage(){
        return mileage;
    }
    public void setCompanyname(String companyname1){
        this.companyname=companyname1;
    }
    public void setModelname (String modelname1){
        this.modelname = modelname1;
    }
    public void setYear (int year1){
        this.year = year1;
    }

    public static void main(String[] args) {
        Car note = new Car("Nissan", "Maica",2015, 52901);
        System.out.println("Company Name :" + note.companyname);
        System.out.println("Company model :" +note.modelname);
        System.out.println("Year :" +note.year);
        System.out.println("Mileage :" +note.getMileage());
    }
}
