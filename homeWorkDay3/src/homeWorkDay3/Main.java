package homeWorkDay3;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(44215280);
		student.setName("Emre");
		student.setName("Durmaz");
		student.setEmail("emredrmz89@gmail.com");
		student.setTakeCourse("Java");

		System.out.println(student.getOtoNickName());

		Instructor instructor = new Instructor(8952472, "Taner", "Öztürk", "tanerxx@gmail.com", "Java");

		System.out.println(instructor.getOtoNickName());

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		StudentManager studentManager2 = new StudentManager();
		studentManager2.delete();

		StudentManager studentManager3 = new StudentManager();
		studentManager3.update();

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

	}

}
