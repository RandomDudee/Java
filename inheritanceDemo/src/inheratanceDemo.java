public class inheratanceDemo {
    public static void main(String[] args) {

//        normalMember mem1 = new normalMember("James", 1, 2010);
//        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
//
//        mem1.calculateAnnualFEE();
//        mem2.calculateAnnualFEE();
//
//        mem1.displayMemInfo();
//        mem2.displayMemInfo();
//
//        mem1.setDiscount();
//        mem1.calculateAnnualFEE();
//        mem1.displayMemInfo();

        Member[] clubMembers = new Member[6];

        clubMembers[0] = new normalMember("James", 1, 2010);
        clubMembers[1] = new normalMember("Andy", 2 , 2011);
        clubMembers[2] = new normalMember("Bill", 3,2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] =new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] = new Member("Yvonne", 6, 2013);

        for (Member m : clubMembers)
        {
            m.calculateAnnualFEE();
            m.displayMemInfo();
        }
    }
}