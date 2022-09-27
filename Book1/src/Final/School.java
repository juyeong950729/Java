package Final;
/*
 * 날짜 : 2022/09/26
 * 이름 : 조주영
 * 내용 : 학교 클래스
 * 
 */

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good School";
	private ArrayList<Student> studentList = new ArrayList<Student>();  // 등록된 학생
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();  // 과목 리스트
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null)
			instance = new School();
		return instance;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void addStudent (Student student) {
		studentList.add(student);
	}
	
	public void addSubject (Subject subject) {
		subjectList.add(subject);
	}
	
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}