public class Customer {
    private String customerName;
    private int creditLimit;
    private String customerEmail;
    public Customer(String customerName, int creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }
    public Customer() {
        this("Default Name", 0, "Default Email");
    }
    public Customer(String customerName, String customerEmail) {
        this(customerName, 1000, customerEmail);
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
}
