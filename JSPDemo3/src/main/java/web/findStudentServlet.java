package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Course;
import Entity.Student;

public class findStudentServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//模拟查询学生
		Student s=new Student();
		s.setName("zhangsan");
		s.setAge(23);
		s.setSex("m");
		s.setInteres(new String[] {"看书","打球","发呆"});
		Course c=new Course();
		c.setID(1);
		c.setCourseName("java");
		c.setDays("10");
		s.setCourse(c);
		//将数据绑定到request上
		req.setAttribute("stu", s);
		//转发给student.jsp
		req.getRequestDispatcher("student.jsp").forward(req, res);
		
		
	}

}
