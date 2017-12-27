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
		//session可以存任意类型的数据
		session.setAttribute("user", user);
		//服务器相应时自动做出如下处理：
		//Cookie c=new Cookie("JSESSIONID",seesion.getID());
		//c.setPath(request.getContextPath());
		//reponse.addCookie(c);
		
	}

}
