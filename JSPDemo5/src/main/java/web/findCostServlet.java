/**
 * 
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author wentao
 */
public class findCostServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//������������������Զ��������ȱ����JSESSIONID,Ȼ����������ݴ�ID���Ҿɵ�seesion
		HttpSession session=req.getSession();
		String user=(String)session.getAttribute("user");
		res.setContentType("text/html");
		PrintWriter p=res.getWriter();
		p.println(user);
		p.close();
	}

}
