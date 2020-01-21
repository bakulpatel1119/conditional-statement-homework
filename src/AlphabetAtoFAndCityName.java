// INPUT ANY ALPHABET FROM A TO F AND PRINT THEIR CITY NAME ACCORDINGLY USING SWITCH

import java.util.Scanner;

public class AlphabetAtoFAndCityName {

    public static void main(String[] args) {   // MAIN METHOD

        Scanner scanner = new Scanner(System.in);   // SCANNER OBJECT CREATED TO INPUT USER DATA
        System.out.println("Please enter any alphabet");


        String alphabet = scanner.next().toUpperCase();
        char ch = alphabet.charAt(0);

               switch (ch) {

            case 'A' :
            System.out.println("Ahmedabad");
            break;

            case 'B' :
                System.out.println("Bangalore");
                break;

            case 'C' :
                System.out.println("Chandigarh");
                break;

            case 'D' :
                System.out.println("Delhi");
                break;

            case 'E' :
                System.out.println("Etawah");
                break;

            case 'F' :
                System.out.println("Faridabad");
                break;

            default:

                System.out.println("INVALID ENTRY");

        }

    }
}

// END OF PROGRAMME