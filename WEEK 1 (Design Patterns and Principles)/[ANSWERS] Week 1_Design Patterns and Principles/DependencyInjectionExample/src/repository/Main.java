package repository;


public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();


        CustomerService customerService = new CustomerService(customerRepository);


        Customer customer = customerService.getCustomerById(1);
        System.out.println("Customer: " + customer);
    }
}
