import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an interger: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.print("Enter a Double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %f.%n%n", myDouble);

        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);

    }
}
