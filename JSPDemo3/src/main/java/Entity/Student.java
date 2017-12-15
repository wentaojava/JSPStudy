package Entity;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private Integer age;
	private String sex;
	private String[] interes;
	private Course course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getInteres() {
		return interes;
	}
	public void setInteres(String[] interes) {
		this.interes = interes;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
