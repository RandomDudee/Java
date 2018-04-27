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
    }
}
