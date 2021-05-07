package homeWorkDay3;

public class Instructor extends User {

	private String name;
	private String lastName;
	private String giveCourse;

	public Instructor() {

	}

	public Instructor(int id, String name, String lastName, String email, String giveCourse) {
		super(id, email);
		this.name = name;
		this.lastName = lastName;
		this.giveCourse = giveCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGiveCourse() {
		return giveCourse;
	}

	public void setGiveCourse(String giveCourse) {
		this.giveCourse = giveCourse;
	}

}
