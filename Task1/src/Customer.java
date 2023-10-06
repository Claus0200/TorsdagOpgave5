public class Customer {
    //Task 1.a
    //De her attributer/felter er private, så vi skal metoder til at sende dem steder hen.
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    //Det her er konstrukteren som får værdierne vi sender med i parameteret når vi laver en instant/objekt af klassen
    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    //toString() er en indbygget funktion i en klasse. Her der tager vi og erstater den indbyggede funktionen med noget nyt.
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Username: " + username;
    }

    //Nedenunder her er 4 getters(), men vi benytter dem ikke helt.
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
