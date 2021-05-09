import java.util.Scanner;

public class Objective4Lab2 {
  public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5, numsum = num1 + num2 + num3;
    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3, dubsum = dub1 + dub2 + dub3;

    System.out.println("Please enter the first whole number you wish to add.");
    int num1 = scanner.nextInt();
    System.out.println("Please enter the second whole number you wish to add.");
    int num2 = scanner.nextInt();
    System.out.println("Please enter the third whole number you wish to add.");
    int num3 = scanner.nextInt();
    System.out.println("Please enter the first decimal number you wish to add.");
    double dub1 = scanner.nextDouble();
    System.out.println("Please enter the second decimal number you wish to add.");
    double dub2 = scanner.nextDouble();
    System.out.println("Please enter the third decimal number you wish to add.");
    double dub3 = scanner.nextDouble();
    System.out.println("The sum of" + num1 + "+" + num2 + "+" + num3 + "=" numsum);
    System.out.println("The sum of" + dub1 + "+" + dub2 + "+" + dub3 + "=" dubsum);

  }
}
