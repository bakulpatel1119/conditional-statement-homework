// THIS PROGRAMME WILL GIVE YOU AN ANSWER IF ENTERED VALUES ARE OOD OR EVEN USING TERNERY OPERATER ?:

import java.util.Scanner;

public class OddOrEven {

    // MAIN METHOD

    public static void main (String [] args) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA
        Scanner scanner =   new Scanner(System.in);

        System.out.println("Enter first Number");

        // VARIBALE CREATED TO ACCEPT AND STORE USER INPUT DATA
        int num1 = scanner.nextInt();

        System.out.println("Enter second Number");

        // VARIBALE CREATED TO ACCEPT AND STORE USER INPUT DATA
        int num2 = scanner.nextInt();

            System.out.println((num1%2==0? + num1 + " is Even number" : + num1 + " is Odd number"));
            System.out.println((num2%2==0? + num2 + " is Even number" : + num2 + " is Odd number"));
    }
}
