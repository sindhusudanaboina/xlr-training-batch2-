// Base class: Employee
class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String address;

    // Constructor for Employee
    public Employee(int id, String lastName, String firstName, String address) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Address: " + address);
    }
}

// Derived class: Manager
class Manager extends Employee {
    private String department;

    // Constructor for Manager
    public Manager(int id, String lastName, String firstName, String address, String department) {
        super(id, lastName, firstName, address);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Overriding displayDetails method to include department
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(1, "Smith", "John", "123 Main Street");
        System.out.println("Employee Details:");
        emp.displayDetails();

        // Creating a Manager object
        Manager mgr = new Manager(2, "Doe", "Jane", "456 Elm Street", "IT");
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}
