import model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee("Sara", 123, "sara@mail.ma");

        Course mathCourse = new Course(2, "Math", 144);
        Course discretMath = new Course(4, "Discret Math", 80);

        Lecturer researchEmployee1 = new Lecturer(999, "John", "gmail@gmail.al");
        researchEmployee1.setFieldOfScience("Math");
        researchEmployee1.addCourse(mathCourse);

        ResearchEmployee researchEmployee2 = new ResearchEmployee(6789, "Mark", "lala@la.la");
        researchEmployee2.setFieldOfScience("Teorver");

        ResearchEmployee researchEmployee3 = new ResearchEmployee(5, "Alice", "gm@ya.ru");
        researchEmployee3.setFieldOfScience("Matan");

        Lecturer researchEmployee4 = new Lecturer(1, "Sophie", "soph@ya.ru");
        researchEmployee4.setFieldOfScience("DiscretMath");
        researchEmployee4.addCourse(discretMath);

        Institute teorverInstitute = new Institute("TeorverInstitute", "City, Road Xxx, 16",
                new ArrayList<>(Arrays.asList(researchEmployee1, researchEmployee2)));
        Institute matanInstitute = new Institute("matanInstitute", "Town, Street  Hxh, 122",
                new ArrayList<>(Arrays.asList(researchEmployee3, researchEmployee4)));

        Dean mathDean = new Dean(112, "Jack", "email@mail.com");
        Faculty mathFaculty = new Faculty("MathFaculty", new ArrayList<>(Arrays.asList(teorverInstitute, matanInstitute)), mathDean);
        University university = new University(new ArrayList<>(Collections.singletonList(mathFaculty)));

        Project project = new Project("StudyingOfMath", new Date(2022, Calendar.DECEMBER, 12), new Date(2022, Calendar.DECEMBER, 30));
        Participation participation1 = new Participation(12, researchEmployee2, project);
        Participation participation2 = new Participation(40, researchEmployee1, project);

        System.out.printf(String.format("University is %s. \nAdministrative Employee is %s. \nResearchers participations are %s, \n%s",
                university, administrativeEmployee, participation1, participation2));
    }
}
