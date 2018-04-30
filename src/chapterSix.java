public class chapterSix {
    public static void main(String[] args) {
        //Control Flow Statements
        /*
        Decision-making(if, switch)
        Looping (for, while, do-while)
        Branching (break, continue)
         */

        // 6.1 Comparison Operators
        /*
        Equals to ==
        Not equal !=
        Greater than / equal to > / >=
        Smaller than / equal to < / <=
        AND operator &&
        OR operator ||
        */

        // 6.2 Decision making statements
        // 6.2.1 If Statements

        // SEE ifDemo.java

//        if (condition 1 is met){
//            do Task A
//        }
//        else if (condition 2 is met){
//            do Task B
//        }
//        else if (condition 3 is met){
//            do Task C
//        }
//        else{
//            do task D
//        }

        // 6.2.2 Ternary operator
        // condition ? value to return if true : value to return if false
        int myNum = 3>2 ? 10 : 5;
        System.out.println(myNum);

        // 6.2.3 Switch Statement
        /*switch (variable used for switching)
        {
            case firstCase:
                do A;
                break;

            case secondCase:
                do B;
                break;

            default:
                do c;
                break;
         }
        */

        // 6.3 Looping Statements
        // 6.3.1 For Statements
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        int[] myNumbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }

        // 6.3.2 Enhanced For Statement
        /*
        for (variable declaration : name of array)
        {

        }
         */
        for (int item : myNumbers)
            System.out.print(item + " ");

        // 6.3.3 While Statements
        /*
        while (condition is true)
        {
            do A
        }
         */
        System.out.println(" ");
        int counter = 5;

        while (counter > 0){
            System.out.println("Counter = " + counter);
            counter = counter -1;
        }

        // 6.3.4 Do-while Statements
        int counter2 = 100;

        do {
            System.out.println("Counter2 = " + counter2);
            counter2++;
        } while (counter2<0);

        // 6.4 Branching Statements
        // 6.4.1 Break Statement
//        for (int i = 0; i <5; i++)
//        {
//            System.out.println("i = " + i);
//            if (i == 2)
//                break;
//        }

        // 6.4.2 Continue Statement
        for (int i = 0; i <5; i++)
        {
            System.out.println("i = " + i);
            if (i == 2)
                continue;
            System.out.println("I will not be printed if i=2.");
        }

        // 6.5 Exception Handling
        /*
        Try-catch-finally

        try
        {
            do something
        }
        catch (type of error)
        {
            do something else when an error occurs
        }
        finally
        {
            do this regardless of whether the try or catch condition is met.
        }
         */
        //See errorDemo

        // 6.5.1 Specific Errors
        // See errorDemo2


    }
}
