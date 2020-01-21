// THIS PROGRAMME WILL GIVE YOU ANSWERS LIKE TOTAL MARKS, PERCENTAGE, RESULTS - PASS OR FAIL ON THE BASIS OF PASS ALL SUBJECTS AND PASS GRADE

import java.util.Scanner;

public class student1 {


    public static void main (String [] args ) {  // Main Method

        Scanner scanner = new Scanner(System.in);  // Scanner object created to input data

        System.out.println("Enter Student Name");
        String name1 = scanner.next();  // variable created to accept and store data from user

        System.out.println("Enter roll no.");
        int rollnum = scanner.nextInt();  // variable created to accept and store data from user

        System.out.println("Enter English subject marks");
        int eng1 = scanner.nextInt();   // Value given to variable input from user

        System.out.println("Enter Maths subject marks");
        int mat1 = scanner.nextInt();  // Value given to variable input from user

        System.out.println("Enter Science subject marks");
        int sci1 = scanner.nextInt();

        int total1 = eng1 + mat1 + sci1;
        double per1 = (total1*100.0) / 300.0;
        double per = Math.round(per1*100.00) / 100.00; // formula used to keep 2 digit after decimal point

        System.out.println("Student name is " + name1);
        System.out.println("Roll Number is " + rollnum);
        System.out.println("English Marks : " + eng1);
        System.out.println("Maths Marks : " + mat1);
        System.out.println("Science Marks : " + sci1);

        System.out.println("--------------------------------");
        System.out.println("TOTAL Marks : " + total1);




        System.out.println("--------------------------------");
        System.out.println("Percentage is  : " + per+"%");

        System.out.println("--------------------------------");

        if (eng1 >=35 && mat1>=35 && sci1>=35) {
            System.out.println("Your Result = PASS");
        }
        else
        {
            System.out.println("Your Result = FAIL");
        }

        System.out.println("--------------------------------");

        if (per >= 80 && eng1 >=35 && mat1>=35 && sci1>=35)
        {
            System.out.println("Your Pass Garde is A+");
        }
        else if (per >= 60 && eng1 >=35 && mat1>=35 && sci1>=35)
        {
            System.out.println("Your Pass Garde is A");
        }
        else if (per >= 50 && eng1 >=35 && mat1>=35 && sci1>=35)
        {
            System.out.println("Your Pass Garde is B");
        }
        else if (per >= 35 && eng1 >=35 && mat1>=35 && sci1>=35)
        {
            System.out.println("Your Pass Garde is C");
        }

    }




}

