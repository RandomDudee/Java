public class inheratanceDemo {
    public static void main(String[] args) {

        normalMember mem1 = new normalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        mem1.calculateAnnualFEE();
        mem2.calculateAnnualFEE();

        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFEE();
        mem1.displayMemInfo();
    }
}
