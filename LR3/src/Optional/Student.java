package Optional;

public class Student extends Person {
	public Student(String name, String surname) {
		super(name, surname);
	}
	
	public void goToCourse(Course course) {
		course.addStudent(this);
	}
}
