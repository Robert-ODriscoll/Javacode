package UML_1;

/**
 * Created by robertprog on 09/11/2016.
 */
public class PayrollDriver {

    public static void main(String[] args){
        //Instantiates a payroll object with 2 arg constructor
        Payroll emp1 = new Payroll("Robert O Driscoll", 1);

        // Sets pay information
        emp1.setHoursWorked(39.8);
        emp1.setPayRate(8.45);

        //Get the employee information
        System.out.println("Payroll Info: " + "\n" +
                        "Name: " + emp1.getName() + "\n" +
        "Id Number: " + emp1.getIdNumber() + "\n" +
        "Hours Worked: " + emp1.getHoursWorked() + "\n" +
        "Pay Rate: " + emp1.getPayRate() + "\n" +
        "Gross Pay: " + emp1.getGrossPay());
    }


}

