public class Customer {
    //Task 1.a
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Username: " + username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
