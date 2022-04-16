package com.functional_Interface;

import java.util.function.Consumer;

/**
 * A Consumer<T> function, represents an operartion that takes one single argument,
 * and return no result.
 */
public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "3547145");
        //  greetCustomer(new Customer("German","351-7556148"));
        Customer german = new Customer("German","78945612");
        greetCustomerFunction.accept(german);

    }

    static Consumer<Customer> greetCustomerFunction = customer ->
            System.out.println("Hello " + customer.customerName + " Thanks for registering" +
                    "your phone number " + customer.phoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " Thanks for registering" +
                "your phone number " + customer.phoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String phoneNumber;

        public Customer(String customerName, String phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }
}
