import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ChapterNine {
    public static void main(String[] args) {

        //9.2 Autoboxing and unboxing
//        Integer intObject = new Integer(100);
        Integer intObject = 100;

//        int m = intObject.intValue();
        int m = intObject;

        //9.3 Lists
//        int[] myArray = new int[10];
//
        //9.4 ArrayList
        // ArrayList<Type> nameOFArrayList = new ArrayList<>();

        ArrayList<Integer> userAgeList = new ArrayList<>();
        List<String> userNameList2 = new ArrayList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        System.out.println(userAgeList);
        userAgeList.add(2, 51); //index 2 add no. 51
        System.out.println(userAgeList);

        userAgeList.set(3, 49); // Changes index 3 (4th pos) to 49 from 45
        System.out.println(userAgeList);

        userAgeList.remove(3); //removes index x
        System.out.println(userAgeList);


        System.out.println(userAgeList.get(2));

        System.out.println(userAgeList.size());

        System.out.println(userAgeList.contains(51));
        System.out.println(userAgeList.contains(12));

        System.out.println(userAgeList.indexOf(53));
        System.out.println(userAgeList.indexOf(12));

        Object[] myArray = userAgeList.toArray();

//        userAgeList.clear();
//        System.out.println(userAgeList);


        // LinkedList
//        myArrayList = {"Hello", "Good", "Morning"};
//        LinkedList<Type> nameOfLinkedList = new LinkedList<>();

        System.out.println(userAgeList.get(0)); //.poll does not work? It is supposed to remove the first element from the List so [40] [53, 51, 53]

        //System.out.println(userAgeList.peak); Works the same as .get(0)


    }

    public void methodOne (ArrayList<Integer> m)
    {
        //Some implementation code
    }

    public ArrayList<Integer> methodTwo()
    {
        ArrayList<Integer> a = new ArrayList<>();
        // Some implementation code

        return a;
    }

}


