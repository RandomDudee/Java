

public class InterfaceDemo {

    public static void main(String[] args) {

        Myclass a = new Myclass();
        a.someMethod();

        System.out.println("The value of the constant is " + MyInterface.myInt);

        a.someDefaultMethod();
        MyInterface.someStaticMethod();
    }
}

class Myclass implements MyInterface{
    @Override
    public void someMethod()
    {
        System.out.println("This is a method implemented in MyClass");
    }
}

interface MyInterface{

    int myInt = 5;
    void someMethod();


    public static void someStaticMethod()
    {
        System.out.println("This is a static method in an interface");
    }

    public default void someDefaultMethod()
    {
        System.out.println("This is a default method in an interface");
    }
}


