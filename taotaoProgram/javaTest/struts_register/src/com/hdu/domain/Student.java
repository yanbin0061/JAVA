package com.hdu.domain;

import java.io.Serializable;

public class Student implements Serializable {
	private String username;//����Ϊ���ַ�����null��Ҫȥ�ո�
	private int age;//����������18-100֮��
	private String email;//��������ĸ�ʽ����
	private String password;//���룺������3-8λ
	private String repassword;//ȷ������
	private int score;//�ɼ�����������Ȼ��
	private String url;//������ҳ���������url��ַ
	private String gender;//�Ա�
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
