import java.math.BigDecimal;
import java.util.Scanner;

public class InsurancePoliciesUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = "";
//        while (!type.equals("M") && !type.equals("H")) {
//            System.out.println("What type of policy do you want? (M)otor or (H)ome?");
//            type = scanner.nextLine().toUpperCase();
//        }
//        System.out.println(type);

        do {
            System.out.println("What type of policy do you want? (M)otor or (H)ome?");
            type = scanner.nextLine().toUpperCase();
        } while (!type.equals("M") && !type.equals("H"));

        System.out.println(type);

        try {

            if (type.equals("M")) {
                MotorInsurancePolicy policy = new MotorInsurancePolicy();
                System.out.println("Enter the policy number");
                policy.setPolicyNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the title");
                policy.setTitle(scanner.nextLine());
                System.out.println("Enter the first name");
                policy.setFirstName(scanner.nextLine());
                System.out.println("Enter the surname");
                policy.setSurname(scanner.nextLine());
                System.out.println("Enter the sum insured");
                policy.setSumInsured(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter the price");
                policy.setPrice(new BigDecimal(scanner.nextLine()));
                policy.setActive(true);
                System.out.println("enter make");
                policy.setMake(scanner.nextLine());
                System.out.println("enter model");
                policy.setModel(scanner.nextLine());
                System.out.println("enter year of registration");
                policy.setYearOfRegistration(Integer.parseInt(scanner.nextLine()));
                System.out.println(policy);
            } else {
                HomeInsurancePolicy policy = new HomeInsurancePolicy();
                System.out.println("Enter the policy number");
                policy.setPolicyNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the title");
                policy.setTitle(scanner.nextLine());
                System.out.println("Enter the first name");
                policy.setFirstName(scanner.nextLine());
                System.out.println("Enter the surname");
                policy.setSurname(scanner.nextLine());
                System.out.println("Enter the sum insured");
                policy.setSumInsured(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter the price");
                policy.setPrice(new BigDecimal(scanner.nextLine()));
                policy.setActive(true);
                System.out.println("enter address");
                policy.setAddress(scanner.nextLine());
                System.out.println("enter year built");
                policy.setYearBuilt(Integer.parseInt(scanner.nextLine()));
                System.out.println(policy);
            }

        }
        catch(Exception e) {
            throw new InvalidEntryException();
        }
    }

}
