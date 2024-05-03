package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to enter any radius value of the circle and find out the area.(formula of area A=PT*r*r)
 */
public class Programme_6_AreaOfCircle {

    // Calculating the area of circle
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        // closing the scanner object
        scanner.close();
    }

}
