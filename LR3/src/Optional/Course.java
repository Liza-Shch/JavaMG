package Optional;

import java.util.ArrayList;

public class Course {
	public String name;
	public ArrayList<Student> students = new ArrayList<Student>();
	public Teacher teacher;
	
	public Course(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
}
