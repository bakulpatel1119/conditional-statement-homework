// THIS PROGRAMME WILL TELL IF THE PERSON IS ELIGIBLE TO VOTE

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {     // MAIN METHOD

        Scanner scanner = new Scanner(System.in);   // SCANNER OBJECT CREATED
         System.out.println("Enter your age ");

        int age1 = scanner.nextInt();  // VARIABLE CREATED TO STORE AND ACCEPT DATA FROM USER INPUT

        if (age1 >= 18) {
            System.out.println("You are eligible to Vote");

        } else {
            System.out.println("You are not eligible to vote. You must be older than or equal to 18 years old");

        }

    }
}
