package com.hdu.web.action;


import com.hdu.domain.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {
	private Student student = new Student(); 
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String addStudent(){
		return SUCCESS; 
	}
}
