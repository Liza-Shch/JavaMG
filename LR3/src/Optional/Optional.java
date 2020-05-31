package Optional;

import java.util.ArrayList;

public class Optional {
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	public Archive archive = new Archive();
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void startCourse(Teacher teacher, Course course) {
		teacher.startCourse(course);
	}
	
	public void goToCourse(Student student, Course course) {
		student.goToCourse(course);
	}
	
	public void putMark(Teacher teacher, Student student, Course course, int mark) {
		Mark newMark = teacher.createMark(mark, student, course);
		this.archive.addMark(newMark);
	}
}
