package model;

public abstract class Employee {

    public Employee(int ssNumber, String name, String email) {
        this.ssNumber = ssNumber;
        this.name = name;
        this.email = email;
    }

    private int ssNumber;
    private String name;
    private String email;
    private static int numberOfEmployees;

    public int getSsNumber() {
        return this.ssNumber;
    }

    public void setSsNumber(int ssNumber) {
        this.ssNumber = ssNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return  "{ssNumber=" + ssNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "}\n";
    }
}