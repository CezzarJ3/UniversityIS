package model;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchEmployee {

    private List<Course> listOfCourses;

    public Lecturer(int ssNumber, String name, String email) {
        super(ssNumber, name, email);
        this.listOfCourses = new ArrayList<>();
    }

    public List<Course> getListOfCourses() {
        return this.listOfCourses;
    }

    public void addCourse(Course course) {
        this.listOfCourses.add(course);
    }

    public void setListOfCourses(List<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "listOfCourses=" + listOfCourses + "\n" +
                super.toString();
    }
}