package model;

public class Participation {

	private int partTimeHours;
	private final ResearchEmployee researcher;
	private final Project project;

	public Participation(int partTimeHours, ResearchEmployee researcher, Project project) {
		this.partTimeHours = partTimeHours;
		this.researcher = researcher;
		this.project = project;
	}

	public int getPartTimeHours() {
		return this.partTimeHours;
	}

	public void setPartTimeHours(int partTimeHours) {
		this.partTimeHours = partTimeHours;
	}

	public ResearchEmployee getResearcher() {
		return this.researcher;
	}

	public Project getProject() {
		return this.project;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"partTimeHours=" + partTimeHours +
				", researcher=" + researcher +
				", project=" + project +
				'}';
	}
}