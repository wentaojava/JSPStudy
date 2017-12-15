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
		//ģ���ѯѧ��
		Student s=new Student();
		s.setName("zhangsan");
		s.setAge(23);
		s.setSex("m");
		s.setInteres(new String[] {"����","����","����"});
		Course c=new Course();
		c.setID(1);
		c.setCourseName("java");
		c.setDays("10");
		s.setCourse(c);
		//�����ݰ󶨵�request��
		req.setAttribute("stu", s);
		//ת����student.jsp
		req.getRequestDispatcher("student.jsp").forward(req, res);
		
		
	}

}
