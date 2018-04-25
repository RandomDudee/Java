

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




    }

}
