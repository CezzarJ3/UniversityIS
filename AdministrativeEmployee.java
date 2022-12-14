package model;

public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(String name, int ssNumber, String email) {
        super(ssNumber, name, email);
        setNumberOfEmployees(getNumberOfEmployees() + 1);
    }

    public String makeEduPlan() {
        return "Plan is made!";
    }

    public Participation addResearcherToProject(Project project, ResearchEmployee researchEmployee) {
        return new Participation(12, researchEmployee, project);
    }
}