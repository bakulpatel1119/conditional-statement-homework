// THIS PROGRAMME WILL TELL YOU IF ENTERED NUMBER IS ALPHABET, NUMBER AND SYMBOL

import java.util.Scanner;

public class FindNumberAlphabetOrSymbol {
    // MAIN METHOD
    public static void main(String[] args) {

        // SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any Value");
        // VARIABLE CREATED TO STORE AND ACCEPT USER DATA
        char ch1 = scanner.next().charAt(0);

        if (ch1>='0' && ch1<='9') {
            System.out.println("Entered value " + ch1 + " is number");
        }
        else if ((ch1>='A' && ch1<='Z')|| ch1>='a' && ch1<='z') {
            System.out.println("Entered value " + ch1 + " is alphabet");
        }
        else
            System.out.println("Entered value " + ch1 + " is Symbol");
    }
}
