import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    // Addition, subtraction, multiplication, division
    Scanner input = new Scanner(System.in);
    System.out.println("Enter First Number: ");
    float a = input.nextFloat();
    System.out.println("Enter Second Number");
    float b = input.nextFloat();
    System.out.println("\n" + "Addition = " + (a + b));
    System.out.println("Subtraction = " + (a - b));
    System.out.println("Multiplication = " + (a * b));
    System.out.printf("Division = %.2f\n", a / b);
    input.close();
  }
}
