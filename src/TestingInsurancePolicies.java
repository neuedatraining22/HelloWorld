public class TestingInsurancePolicies {

    public static void main(String[] args) {
        InsurancePolicy i1 = new InsurancePolicy();
        i1.setTitle("Mrs");
        i1.setFirstName("Suzy");
        i1.setSurname("Smith");

        System.out.println(i1.getMailingName());
        System.out.println(i1.getMailingName(true));

        int[] numbers = new int[5]; // {0,0,0,0,0}

        InsurancePolicy[] policies = new InsurancePolicy[6]; // { i1, , , , , }
        policies[0] = i1; // null
        policies[1]  = new InsurancePolicy(17,"Mr","Simon","Smith",0,0,false);
        policies[2]  = new InsurancePolicy(17,"Mr","David","Smith",0,0,false);
        policies[3]  = new InsurancePolicy(17,"Mr","Sandra","Smith",0,0,false);
        //policies[4]  = new InsurancePolicy(17,"Mr","Philip","Smith",0,0,false);
        policies[5]  = new InsurancePolicy(17,"Mr","Dion","Smith",0,0,false);

        for (int i = 0; i < policies.length; i++) {
            if (policies[i] != null)
                System.out.println(policies[i].getMailingName());
        }

        for (InsurancePolicy policy : policies ) {

            if (policy != null)
            System.out.println(policy.getMailingName());
        }

    }
}
