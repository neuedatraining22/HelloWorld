import java.math.BigDecimal;
import java.util.Objects;

public class MotorInsurancePolicy extends InsurancePolicy {

    private String make;
    private String model;
    private int yearOfRegistration;

    public MotorInsurancePolicy() {
        super();
        super.setPolicyType(PolicyType.MOTOR);
    }

    public MotorInsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active, String make, String model, int yearOfRegistration) {
        super(policyNumber, title, firstName, surname, sumInsured, price, active, PolicyType.MOTOR);
        this.make = make;
        this.model = model;
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public String getMailingName() {
        return "Motor " + super.getMailingName();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MotorInsurancePolicy that = (MotorInsurancePolicy) o;
        return yearOfRegistration == that.yearOfRegistration && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), make, model, yearOfRegistration);
    }

    @Override
    public String toString() {
        return "MotorInsurancePolicy{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRegistration=" + yearOfRegistration +
                "} " + super.toString();
    }
}
