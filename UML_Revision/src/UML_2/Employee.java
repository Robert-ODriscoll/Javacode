package UML_2;

/**
 * Created by robertprog on 09/11/2016.
 */
public class Employee {

    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;

    private static int nextID = 1000;

    public static final double START_PAY_RATE = 7.75;

    public Employee(String name){
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = START_PAY_RATE;
    }

    public Employee(String name, double startingPay){
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = startingPay;
    }
    public String getName(){
        return name;
    }
    public int getEmployeeID(){
        return EMPLOYEE_ID;
    }
    public double getPayRate(){
        return payRate;
    }
    public void changeName(String newName){
        name = newName;
    }
    public void changePayRate(double newRate){
        payRate = newRate;
    }
    public static int getNextID(){
        int id = nextID;
        nextID++;
        return id;
    }
}
