import java.util.Scanner;

public class Question1 {
    public static void main (String [] args){
        // Question 1
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the radius: ");
        float radius = input.nextFloat();
        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
