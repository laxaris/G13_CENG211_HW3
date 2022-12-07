import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    System.out.println("Enter a number: ");
    int num2 = input.nextInt();
    System.out.println("Enter a number: ");
    int num3 = input.nextInt();
    System.out.println("Enter a number: ");
    int num4 = input.nextInt();
    System.out.println("Enter a number: ");
    int num5 = input.nextInt();
    System.out.println("Enter a number: ");
    int num6 = input.nextInt();
    System.out.println("Enter a number: ");
    int num7 = input.nextInt();
    System.out.println("Enter a number: ");
    int num8 = input.nextInt();
    System.out.println("Enter a number: ");
    int num9 = input.nextInt();
    System.out.println("Enter a number: ");
    int num10 = input.nextInt();
    int sum = num + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
    System.out.println("The sum of the numbers is: " + sum);
    int average = sum / 10;
    System.out.println("The average of the numbers is: " + average);
    int product = num * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
    System.out.println("The product of the numbers is: " + product);
    int smallest = num;
    if (num2 < smallest) {
        smallest = num2;
    }
    if (num3 < smallest) {
        smallest = num3;
    }
    if (num4 < smallest) {
        smallest = num4;
    }
    if (num5 < smallest) {
        smallest = num5;
    }
    if (num6 < smallest) {
        smallest = num6;
    }
    if (num7 < smallest) {
        smallest = num7;
    }
    if (num8 < smallest) {
        smallest = num8;
    }
    if (num9 < smallest) {
        smallest = num9;
    }
    if (num10 < smallest) {
        smallest = num10;
    }
    System.out.println("The smallest number is: " + smallest);
    int largest = num;
    if (num2 > largest) {
}
}}
