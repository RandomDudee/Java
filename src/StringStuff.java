import java.util.Arrays;

public class StringStuff {

    public static void main(String[] args) {

        String message = "Hello World";
        String anotherMessage = "";
        String myName = "Hello World, " + "my name is Sean!";

        int myLength = myName.length();

        String uCase = myName.toUpperCase();
        String lCase = myName.toLowerCase();

        String firstSubstring = message.substring(6);
        String secondSubsting = message.substring(1, 8);

        char myChar = message.charAt(1);

        boolean equalsOrNot = "This is Sean".equals("This is Sean");
        boolean equalsOrNot2 = "This is Sean".equals(message);

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");

        //Arrays

        int[] userAge;
        //int userAge[]; // C/C++ Version
        userAge = new int[] {21, 22, 23, 24, 25};
        int[] userAge3 = new int[5];
        userAge3[0] = 31;
        userAge3[2] = userAge3[2] + 20;

        //Arrays Methods

        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};

        boolean result1 = Arrays.equals(arr1,arr2);
        boolean result2 = Arrays.equals(arr1,arr3);

        int [] source = {12, 1, 5, -2, 14, 18, 20, 25};
        int [] dest = Arrays.copyOfRange(source, 3, 7);
        //dest is now [-2, 16, 14, 18] as it is to 7 not including 7.

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);



        System.out.println("String: " + myName + "\n" + "String Length: " + myLength + "\n" + uCase);

        System.out.println("\n" + firstSubstring + "\n" + secondSubsting);

        System.out.println("\n" + equalsOrNot + "\n" + equalsOrNot2);

        System.out.println(result1 + " " + result2);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers2));

    }
}
