public class VIPMember extends Member {

    public VIPMember(String pname, int pMemberID, int pMemberSince)
    {
        super(pname, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFEE()
    {
        annualFEE = (1-0.01*getDiscount())*1200;
    }


}
