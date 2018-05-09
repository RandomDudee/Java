import java.util.Scanner;

abstract public class Member {

    public String welcome = "Welcome to ABC Fitness";
    protected double annualFEE;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member()
    {
        System.out.println("Parent Constructor with no parameter");
    }

    public Member(String pName, int pMemberID, int pMemberSince)
    {
        System.out.println("Parent Constructor with 3 parameters");

        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;

        System.out.print("Please enter the admin password: ");
        password = input.nextLine();

        if(!password.equals("abcd")){
            System.out.println("Invalid Password. You do not have the authority to edit the discount.");
        } else
        {
            System.out.print("Please enter the discount in % : ");
            discount = input.nextInt();
        }
    }

    public void displayMemInfo(){

        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFEE);
        System.out.println("------------------------------");
    }

    abstract public void calculateAnnualFEE();


}
