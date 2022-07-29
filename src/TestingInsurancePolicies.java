public class TestingInsurancePolicies {

    public static void main(String[] args) {
        InsurancePolicy i1 = new InsurancePolicy();
        i1.setTitle("Mrs");
        i1.setFirstName("Suzy");
        i1.setSurname("Smith");

        System.out.println(i1.getMailingName());
        System.out.println(i1.getMailingName(true));

    }
}
