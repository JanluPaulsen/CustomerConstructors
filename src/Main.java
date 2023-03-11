public class Main {
    public static void main(String[] args) {
        Customer userDetails = new Customer();
        System.out.println(userDetails.getCustomerName());
        System.out.println(userDetails.getCreditLimit());
        System.out.println(userDetails.getCustomerEmail());

        Customer newCustomer = new Customer("Jan","jan@gmail.com");
        System.out.println(newCustomer.getCustomerName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getCustomerEmail());

        Customer customer = new Customer("Juan", 32564, "juan@gmail.com");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getCustomerEmail());
    }
}