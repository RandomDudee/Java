public class normalMember extends Member {

    public normalMember() {
        System.out.println("Child constructor with no parameter");
    }

    public normalMember(String pName, int pMemberID, int pMemberSince)
    {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 parameters");
    }


    @Override
    public void calculateAnnualFEE()
    {
        annualFEE = (1-0.01*getDiscount())*(100 + 12*30);
    }
}
