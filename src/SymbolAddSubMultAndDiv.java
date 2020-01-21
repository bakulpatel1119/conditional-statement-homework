// ENTER ANY TWO NUMBERS AND ASK USER TO ENTER THEIR SYMBOL AND FIND ADDITION, SUBSTRACTION, MULTIPLICATION AND DIVISION


import java.sql.SQLOutput;
import java.util.Scanner;

public class SymbolAddSubMultAndDiv {

    // MAIN METHOD

    public static void main(String[] args) {
// SCANNER OBJECT CREATED TO INPUT USER DATA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter First number");
        // VARIABLE CREATED TO ACCEPT AND STORE USER INPUT DATA

        int a = scanner.nextInt();

        System.out.println("Please enter Second number");

        // VARIABLE CREATED TO ACCEPT AND STORE USER INPUT DATA
        int b = scanner.nextInt();

        int total = a+b;
        int mult = a *b;
        int sub1 = a-b;
        int div = (a/b);

        System.out.println("Please enter valid symbol - / + * ");
        String symbol = scanner.next();
        char symbol1 =  symbol.charAt(0);

        switch(symbol1)

        {
            case '+' :
                System.out.println("The addition of " + a+" + "+ b + " is = " + total);
                break;

            case '-' :
                System.out.println("The substraction of " + a+" - "+ b + " is = " + sub1);
                break;

            case '*' :
                System.out.println("The Multiplication of " + a+" * "+ b + " is = " + mult);
                break;

            case '/' :
                System.out.println("The Division of " + a+" / "+ b + " is = " + div);
                break;

            default:
                System.out.println("Please enter valid symbol");
                break;



        }

    }



}
