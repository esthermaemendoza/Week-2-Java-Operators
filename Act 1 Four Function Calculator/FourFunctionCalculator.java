import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FourFunctionCalculatorWeek2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        int number1 = sc.nextInt();
        
        System.out.println("Enter 2nd Number: ");
        int number2 = sc.nextInt();
        
        System.out.println("\nCalculator Results");
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2)); 
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));
        // Division and modulus behave differently when dealing with negative numbers
        }
    
}
