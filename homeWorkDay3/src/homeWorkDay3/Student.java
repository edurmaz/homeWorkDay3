package homeWorkDay3;

public class Student extends User {

	private String name;
	private String lastName;
	private String takeCourse;

	public Student() {

	}

	public Student(int id, String name, String lastName, String email, String takeCourse) {
		super(id, email);
		this.name = name;
		this.lastName = lastName;
		this.takeCourse = takeCourse;
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

	public String getTakeCourse() {
		return takeCourse;
	}

	public void setTakeCourse(String takeCourse) {
		this.takeCourse = takeCourse;
	}

}
