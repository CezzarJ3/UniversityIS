package model;

public class Dean extends Employee {
    public Dean(int ssNumber, String name, String email) {
        super(ssNumber, name, email);
    }

    public String doControlWork() {
        return "Work is done!";
    }
}