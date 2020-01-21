//THIS PROGRAMME WILL CALCULATE HRA, DA, TA, PF & GROSS SALARY

import java.util.Scanner;

public class Employee {

    public static void  main (String [] args) {             // MAIN METHOD

        Scanner scanner = new Scanner(System.in);  // SCANNER OBJECT CREATED TO INPUT USER DATA

        System.out.println("Enter Employee ID :");
        String id = scanner.next();  // String data type used in case id include character (e.g WAR01 for warehouse staff)

        System.out.println("Enter Employee Name :");
        String employeeName = scanner.next();  // VARIABLE CREATED TO ACCEPT AND STORE USER DATA

        System.out.println("Enter Basic Salary :");
        int basicSalary = scanner.nextInt();  // VARIABLE CREATED TO ACCEPT AND STORE USER DATA

        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name is : " + employeeName);
        System.out.println("Basic Salary is  :  " + basicSalary);

        // DOUBLE DATA TYPE USED AS RESULT WILL BE IN DECIMAL

        double hra = (basicSalary*10.0)/100;
        double da = (basicSalary*8.0)/100;
        double ta = (basicSalary*9.0)/100;
        double pf = (basicSalary*20.0)/100;
        double grossSalary= basicSalary+hra+da+ta-pf;

        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("TA : " + ta);
        System.out.println("PF : " + pf);
        System.out.println("-------------------------");
        System.out.println("Gross Salary is : " + grossSalary);

    }

}
