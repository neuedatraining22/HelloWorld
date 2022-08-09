import java.math.BigDecimal;

public class TestingInsurancePolicies {

    public static void main(String[] args) {


        int[] numbers = new int[5]; // {0,0,0,0,0}

        BigDecimal standardPrice = new BigDecimal(160.37);
        BigDecimal doublePrice = standardPrice.multiply(new BigDecimal("2"));

        InsurancePolicy[] policies = new InsurancePolicy[6]; // { i1, , , , , }
        policies[0]  = new MotorInsurancePolicy(17,"Mr","Simon","Smith",0,standardPrice,false, "Renault", "Megane", 2021);
        policies[1]  = new HomeInsurancePolicy(17,"Mr","David","Smith",0,standardPrice,false, "1029 23rd Street", 1996);


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
