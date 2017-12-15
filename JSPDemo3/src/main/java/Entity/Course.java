package Entity;

import java.io.Serializable;

public class Course implements Serializable {
   private Integer courseID;
   private String courseName;
   private String days;
   
public Integer getID() {
	return courseID;
}
public void setID(Integer courseID) {
	this.courseID = courseID;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getDays() {
	return days;
}
public void setDays(String days) {
	this.days = days;
}
   
}
