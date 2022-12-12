package model;

import java.util.List;

public class University {
    private List<Faculty> listOfFaculties;

    public University(List<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }


    public List<Faculty> getListOfFaculties() {
        return this.listOfFaculties;
    }

    public void setListOfFaculties(List<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "listOfFaculties=" + listOfFaculties +
                '}';
    }
}