package UML_1;

/**
 * Created by robertprog on 09/11/2016.
 */
public class Payroll {
    //Instance Fields
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;

    //Constructor
    public Payroll(String n, int i){
        name = n;
        idNumber = i;
    }

    //Mutators
    public void setName(String n){
        name = n;
    }
    public void setIdNumber(int i){
        idNumber = i;
    }
    public void setPayRate(double p){
        payRate = p;
    }
    public void setHoursWorked(double h){
        hoursWorked = h;
    }

    public String getName(){
        return name;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public double getPayRate(){
        return payRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    //Calculation method that returns gross pay
    public double getGrossPay(){
        return hoursWorked * payRate;
    }



}

