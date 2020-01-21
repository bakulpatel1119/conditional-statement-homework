//THIS PROGRAMME WILL GIVE YOU AN ANSWER IF ENTERED YEAR IS A LEAP YEAR OR NOT

import java.util.Scanner;

public class LeapYear {

    // MAIN METHOD

    public static void main (String [] args ) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Year");

        // VARIBALE CREATED TO ACCEPT AND STORE USER INPUT DATA

        int year = scanner.nextInt();

        if (year%400==0)

        {
        System.out.println(year + " is a Leap Year");
        }

        else if (year%4==0 && year%100!=0)

        {
            System.out.println(year + " is a Leap Year");
        }

        else

        {
            System.out.println(year + " is not a Leap Year");
        }


    }


}
