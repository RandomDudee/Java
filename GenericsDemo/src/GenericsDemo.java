public class GenericsDemo {

    public static void main(String[] args) {

        MyGenericsClass<Integer> g = new MyGenericsClass();

        g.setMyVar(10);
        g.printValue();
    }
}

class MyGenericsClass<T>{

    private T myVar;

    void setMyVar (T i){
        myVar = i;
    }

    void printValue(){
        System.out.println("The value of myVar is " + myVar);
    }
}

class MyGenericsClass2 <T extends Number>
{
//    MyGenericsClass2<String> g2 = new MyGenericsClass2();
//    MyGenericsClass2<Integer> g3 = new MyGenericsClass2();
    MyGenericsClass2<Double> g4 = new MyGenericsClass2();
}
