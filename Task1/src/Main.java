import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Task 1.c
        ArrayList<Customer> customers = new ArrayList<Customer>(); // Her bliver der lavet en arrayliste som kommer til at indeholde kunderne der står på linje 7,8,9
        customers.add(new Customer("Claus", "Jørgensen", "CPHClaus")); //Her laver vi en objekt/instans af klassen Customer, og tilføjer dem til arrayListen customers.
        customers.add(new Customer("John", "Doe", "CPHJohn"));
        customers.add(new Customer("Joe", "Mama", "CPHJoe"));
        System.out.println(customers.get(0)); //Her benytter vi array listens indbygget metode "get(i)", hvor i er index (pladsen i arrayet). I det her eksempel tager den første kunde, og printer den ud.
        printCustomers(customers); //Her sender vi arrayet som står på linje 6, med ind i funktionen "printCustomers", så den laver en kopi af arrayet og sender det videre.

    }
    public static void printCustomers(ArrayList<Customer> customers) {
        //Her tager den alle kunderne inde i array listen customers, som er den vi får sendt med fra metode kaldet, og så printer den dem ud.
        for(Object customer : customers) {
            System.out.println(customer);
        }
    }

}

