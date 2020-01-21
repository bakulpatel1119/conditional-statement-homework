// THIS PROGRAMME WILL GIVE YOU AN ANSWER IF ENTERED LETTER IS VOWEL OR CONSONANT

import java.util.Scanner;

public class VowelOrConsonant {

    // MAIL METHOD

    public static void main(String[] args) {

// SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter single charater from alphabet");

        // VARIABLE CREATED TO ACCEPT AND STORE INPUT USER DATA
        char abcd = scanner.next().charAt(0);

        if (abcd == 'A' || abcd == 'E' || abcd == 'I'||abcd == 'O'|| abcd == 'U'||abcd == 'a' || abcd == 'e' || abcd == 'i'||abcd == 'o'|| abcd == 'u')
        {
            System.out.println("Input letter is Vowel");
        }
            else
                {

                System.out.println("Input letter is Consonant");
            }

    }

}
