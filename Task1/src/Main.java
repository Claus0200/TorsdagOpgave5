import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Task 1.c
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Claus", "Jørgensen", "CPHClaus"));
        customers.add(new Customer("John", "Doe", "CPHJohn"));
        customers.add(new Customer("Joe", "Mama", "CPHJoe"));
        System.out.println(customers.get(0));
        printCustomers(customers);

    }
    public static void printCustomers(ArrayList customers) {
        for(Object customer : customers) {
            System.out.println(customer);
        }
    }

}