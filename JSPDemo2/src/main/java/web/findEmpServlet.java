package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmpDao;
import Entity.Emp;

public class findEmpServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpDao dao=new EmpDao();
		List<Emp> list=dao.findAll();
		//将数据绑定到request上
		req.setAttribute("emps", list);
		//将请求转发给emp_list.jsp
		req.getRequestDispatcher("emp_list.jsp").forward(req, res);
		
	}

}
