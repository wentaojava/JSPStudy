/**
 * 
 */
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author wentao
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String user=req.getParameter("user");
		HttpSession session=req.getSession();
		//session���Դ��������͵�����
		session.setAttribute("user", user);
		//��������Ӧʱ�Զ��������´���
		//Cookie c=new Cookie("JSESSIONID",seesion.getID());
		//c.setPath(request.getContextPath());
		//reponse.addCookie(c);
		
	}

}
