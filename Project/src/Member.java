public class Member {

    private char memberType;
    private int memberID;
    private String name;
    private double fees;

    public Member(char pMemberType, int pMemberID, String pName, double pFees)
    {
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees;

    }

    public char getMemberType()
    {
        return memberType;
    }

    public int getMemberID()
    {
        return memberID;
    }

    public String getName()
    {
        return name;
    }

    public double getFees()
    {
        return fees;
    }

    @Override
    public String toString(){
        return memberType + ", " + memberID + ", " + name + ", " + fees;
    }
}
