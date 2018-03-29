

public class ChapterFive {

    public static void main(String[] args) {

        String print = "Print test";
        String println = "Println test";


        System.out.print(print + "\n"); // print will only print out

        System.out.println(println); // println will print and move the line "cursor" down

        System.out.println("Oracle".substring(1, 4)); // Method in println

        // Escape Sequences

        // \t = tab. \n = newline. \\ = \. \" = ".

        //Formatting Outputs

        System.out.println("The answer for 5.45 divided by 3 is " + (5.45/3));

        System.out.printf("The Answer for %.3f divided by %d is %.2f.",5.45, 3, 3.45/3);

    }

}
