package model;

public class Course {

	private int ID;
	private String name;
	private float hours;

	public Course(int ID, String name, float hours) {
		this.ID = ID;
		this.name = name;
		this.hours = hours;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHours() {
		return this.hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Course{" +
				"ID=" + ID +
				", name='" + name + '\'' +
				", hours=" + hours +
				'}';
	}
}