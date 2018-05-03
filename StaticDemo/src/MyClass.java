public class MyClass {
    //Non static field and method
    public String message = "Hello World";
    public void displayMessage()
    {
        System.out.println("Message = " + message);
    }

    //Static field and method
    public static String greetings = "Good morning";
    public static void displayGreetings()
    {
        System.out.println("Greetings = " + greetings);
    }
}

