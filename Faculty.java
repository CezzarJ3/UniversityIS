package model;

import java.util.List;

public class Faculty {
    private String name;
    private List<Institute> listOfInstitutes;
    private Dean dean;

    public Faculty(String name, List<Institute> listOfInstitutes, Dean dean) {
        this.name = name;
        this.listOfInstitutes = listOfInstitutes;
        this.dean = dean;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Institute> getListOfInstitutes() {
        return this.listOfInstitutes;
    }

    public void setListOfInstitutes(List<Institute> listOfInstitutes) {
        this.listOfInstitutes = listOfInstitutes;
    }

    public Dean getDean() {
        return this.dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ",\n listOfInstitutes=" + listOfInstitutes +
                ", dean=" + dean +
                '}';
    }
}