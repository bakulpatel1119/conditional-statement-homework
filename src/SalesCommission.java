import java.util.Scanner;

public class SalesCommission {

public static void main (String [] args ) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Sales ID");
    String salesID = scanner.next();

    System.out.println("Enter Seller's Name");
    String sellerName = scanner.next();

    System.out.println("Enter Sales Amount");
    int salesAmount = scanner.nextInt();

    System.out.println("Enter Salary Basic");
    int salaryBasic = scanner.nextInt();

    System.out.println("------SALES COMMISSION REPORT------");

    if (salesAmount>=50000) {
        System.out.println("Sales Commission to be paid :"+(salesAmount*35.0)/100);
    }

    else if (salesAmount>=30000) {
        System.out.println("Sales Commission to be paid :"+(salesAmount*20.0)/100);
    }

    else if (salesAmount>=20000) {
        System.out.println("Sales Commission to be paid :"+(salesAmount*10.0)/100);
    }

    else if (salesAmount>=10000) {
        System.out.println("Sales Commission to be paid :"+(salesAmount*5.0)/100);
    }

    else  {
        System.out.println("Sales Commission to be paid :"+(salesAmount*2.0)/100);
    }








}


}
