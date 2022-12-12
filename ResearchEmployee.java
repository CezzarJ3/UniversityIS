package model;

public class ResearchEmployee extends Employee {

    private String fieldOfScience;

    public ResearchEmployee(int ssNumber, String name, String email) {
        super(ssNumber, name, email);
    }

    public String getFieldOfScience() {
        return this.fieldOfScience;
    }

    public void setFieldOfScience(String fieldOfScience) {
        this.fieldOfScience = fieldOfScience;
    }

    @Override
    public String toString() {
        return "ResearchEmployee{" +
                "fieldOfScience='" + fieldOfScience + "', "
                + super.toString();
    }
}