// THIS PROGRAMME WILL INTERCHANGE VALUES OF TWO NUMBERS

import java.util.Scanner;

public class Interchange {

    // MAIN METHOD

public static void main (String [] args ) {

    // SCANNER OBJECT CREATED TO INPUT USER DATA

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter value of X : ");

    // VARIABLE CREATED TO ACCEPT AND STORE USER INPUT DATA

    int x = scanner.nextInt();

    System.out.println("Enter value of Y : ");

    // VARIABLE CREATED TO ACCEPT AND STORE USER INPUT DATA

    int y = scanner.nextInt();

    System.out.println("---------BEFORE----------");
    System.out.println("Value of X was : " + x);
    System.out.println("Value of Y was : " + y);

    // THIS FORMULA WILL CHANGE VALUE OF X AND Y
    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("---------AFTER----------");
    System.out.println("Value of X is : " +x);
    System.out.println("Value of Y is : " +y);

}

}
