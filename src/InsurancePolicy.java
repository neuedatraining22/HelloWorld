import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class InsurancePolicy {

    private int policyNumber;
    private String title;
    private String firstName;
    private String surname;
    private double sumInsured;
    private BigDecimal price;
    private boolean active;
    private LocalDate startDate;

    public InsurancePolicy() {
        startDate = LocalDate.now();
    }

    public InsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, BigDecimal price, boolean active) {
        this.policyNumber = policyNumber;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.sumInsured = sumInsured;
        this.price = price;
        this.active = active;
        startDate = LocalDate.now();
    }

    public String getMailingName() {
        return title + " " + firstName  + " " + surname;
    }

    public String getMailingName(boolean firstInitialOnly) {
        if (firstInitialOnly)
            return title + " " + firstName.substring(0,1)  + " " + surname;
        else
            return getMailingName();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
