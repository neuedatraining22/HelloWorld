public class InsurancePolicy {

    private int policyNumber;
    private String title;
    private String firstName;
    private String surname;
    private double sumInsured;
    private double price;
    private boolean active;

    public InsurancePolicy() {
    }

    public InsurancePolicy(int policyNumber, String title, String firstName, String surname, double sumInsured, double price, boolean active) {
        this.policyNumber = policyNumber;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.sumInsured = sumInsured;
        this.price = price;
        this.active = active;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
