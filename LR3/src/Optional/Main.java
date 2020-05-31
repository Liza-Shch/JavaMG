package Optional;

public class Main {

	public static void main(String[] args) {
		Optional optional = new Optional();
		optional.addTeacher(new Teacher("Иван", "Иванов"));
		optional.addStudent(new Student("Петр", "Петров"));
		optional.addCourse(new Course("Физика"));
		optional.startCourse(optional.teachers.get(0), optional.courses.get(0));
		optional.goToCourse(optional.students.get(0), optional.courses.get(0));
		optional.putMark(optional.teachers.get(0), optional.students.get(0), optional.courses.get(0), 5);
	}

}
