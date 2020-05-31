package Optional;

public class Teacher extends Person {

	public Teacher(String name, String surname) {
		super(name, surname);
	}
	
	public void startCourse(Course course) {
		course.teacher = this;
	}
	
	public Mark createMark(int mark, Student student, Course course) {
		return new Mark(mark, student, course);
	}

}
