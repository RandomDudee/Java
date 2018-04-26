import java.util.Scanner;

public class ChapterFive {

    public static void main(String[] args) {

        String print = "Print test";
        String println = "Println test";


        System.out.print(print + "\n"); // print will only print out

        System.out.println(println); // println will print and move the line "cursor" down

        System.out.println("Oracle".substring(1, 4)); // Method in println

        // 5.2 Escape Sequences
        // \t = tab. \n = newline. \\ = \. \" = ".

        // 5.3 Formatting Outputs
        System.out.println("The answer for 5.45 divided by 3 is " + (5.45/3));

        System.out.printf("The Answer for %.3f divided by %d is %.2f.",5.45, 3, 3.45/3);

        System.out.println("\n");

        System.out.println(30 + 5);

        System.out.println("Hello, " + "how are you?" + " I love Java. ");

        int results = 79;
        System.out.println("You scored " + results + " marks for your test.");

        System.out.println("The sum of 50 and 2 is " + (50 + 2) + ".");

        // 5.3.1 Converters
        System.out.printf("%d", 12); // int = d
        System.out.println("");
        System.out.printf("%f", 12.9); // Floating point number = f
        System.out.printf("%n%d%n%d", 12, 3); //%n = New Line

        // 5.3.2 Flags
        System.out.printf("%8d", 12); // Width Flag 8 moves 6 spaces in front of 12 total 8 spaces.
        System.out.printf("%8.2f", 12.4); // Moves 3 spaces in front, total of 8 including the decimal point.

        System.out.printf("%n%,d", 12345); //Thousand Separator flag eg 1,000

        //5.4 Accepting user input
        //Import Scanner ^^^
        Scanner reader = new Scanner(System.in);


    }

}
