// INPUT ANY 5 NUMBERS AND FIND AVERAGE OF FIVE NUMBERS


import java.util.Scanner;

public class AverageOf5Numbers {

    // MAIN METHOD

    public static void main (String [] args ) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 Numbers :");
        int a = scanner.nextInt();  // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        int b = scanner.nextInt();  // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        int c = scanner.nextInt(); //  VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        int d = scanner.nextInt(); // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER
        int e = scanner.nextInt(); // VARIABLE CREATED TO ACCEPT AND STORE DATA INPUT FROM USER

        System.out.println("Average of above numbers is : " + (a+b+c+d+e)/5.0);
    }

}
