// THIS PROGRAMME WILL GIVE YOU AN ANSWER IF ENTERED VALUE IS POSITIVE, ZERO OR NEGATIVE VALUE

import java.util.Scanner;

public class PostiveNegativeZero {

    // MAIN METHOD

    public static void main (String [] args ) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");

        // VARIABLE CREATED TO ACCEPT AND STORE USER INPUT DATA
        int num2 = scanner.nextInt();

        if (num2==0) {
            System.out.print("The Given number " + num2 + " is ZERO value");
        }
            else if (num2>0) {
            System.out.print("The Given number " + num2 + " is POSITIVE value");
        }
                else {
            System.out.print("The Given number " + num2 + " is NEGATIVE value");
        }
                }
    }

