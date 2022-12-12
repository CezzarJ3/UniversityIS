package model;

public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(String name, int ssNumber, String email) {
        super(ssNumber, name, email);
        setNumberOfEmployees(getNumberOfEmployees() + 1);
    }
}