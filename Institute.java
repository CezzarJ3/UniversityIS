package model;

import java.util.List;

public class Institute {

    private String name;
    private String address;
    private List<ResearchEmployee> listOfResearchEmployees;

    public Institute(String name, String address, List<ResearchEmployee> listOfResearchEmployees) {
        this.name = name;
        this.address = address;
        this.listOfResearchEmployees = listOfResearchEmployees;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ResearchEmployee> getListOfResearchEmployees() {
        return this.listOfResearchEmployees;
    }

    public void setListOfResearchEmployees(List<ResearchEmployee> listOfResearchEmployees) {
        this.listOfResearchEmployees = listOfResearchEmployees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ",\n listOfResearchEmployees=" + listOfResearchEmployees +
                "}\n";
    }
}