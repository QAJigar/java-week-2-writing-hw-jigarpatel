package homework_week_6;

import java.util.Scanner;

public class Programme_5_Calculator {
    /**
     * write a programme for a calculator with addition, subtraction, multiplication and division.
     * method all with parameters and use starting concatenation method.
     * Note: -Two static and tow instance method.
     */

// static method
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;

    }

    //instance method
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a +  "and " +b+ " is " + result);
    }

    public int division(int a, int b) {
        return a / b;

    }
    public static void main(String[] args) {
        //Scanner declaration for reading input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        addition(a, b);

        int sumResult = subtraction(a,b);
        System.out.println("The subtraction of " +a+ " and " + b + " is : " + sumResult);

        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a, b );
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        //closing the scanner object
        scanner.close();



    }

}
