// THIS PROGRAMM WILL CONVERT UPPERCASE ALPHABET TO LOWERCASE

import java.util.Scanner;

public class UpperLowerCase {

    // MAIN METHOD

    public static void main(String[] args) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any alphabet in UPPERCASE");
        String alpha = scanner.next().toLowerCase();
        char alphabet = alpha.charAt(0);

        System.out.println("lowercase of entered alphabet is " + alphabet);


    }
}
