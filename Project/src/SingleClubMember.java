public class SingleClubMember extends Member{

    private int club;

    public int getClub() {
        return club;
    }

    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub)
    {
        super(pMemberType, pMemberID, pName, pFees);
    }

    public int setClub(int pClub){
        return club;
    }

    public String toString(){
        return  super.toString();
    }


}
