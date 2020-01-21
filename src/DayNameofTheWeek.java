import sun.text.normalizer.UCharacter;
// INPUT ANY  NUMBERS TO PRINT THE DAY NAME OF THE WEEK

import java.util.Scanner;

public class DayNameofTheWeek {
    public static void main(String[] args) {   // MAIN METHOD
        Scanner scanner = new Scanner(System.in);  // SCANNER OBJECT CREATED TO INPUT DATA

        System.out.println("Enter any day number of the week");

        int week = scanner.nextInt();   // VARIABLE CREATED TO INPUT AND STORE DATA INPUT FROM USER

        switch (week) {

            case 1 :
                System.out.println("1st day of week is Monday");
                break;

            case 2 :
                System.out.println("2nd day of week is Tuesday");
                break;

            case 3 :
                System.out.println("3rd day of week is Wednesday");
                break;

            case 4 :
                System.out.println("4th day of week is Thursday");
                break;

            case 5 :
                System.out.println("5th day of week is Friday");
                break;

            case 6 :
                System.out.println("6th day of week is Saturday");
                break;

            case 7 :
                System.out.println("7th day of week is Sunday");
                break;

            default:
                System.out.println("Please enter valid day number of Week");

        }

    }
}
