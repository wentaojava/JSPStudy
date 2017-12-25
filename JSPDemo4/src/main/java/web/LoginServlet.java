/**
 * 
 */
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author wentao
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//request.setCharacterEncoding("utf-8");
			String user=request.getParameter("user");
			//Cookie中只能存一条数据，且只能存字符串
			Cookie c1=new Cookie("user",user);
			//将Cookie绑定到reponse中，服务器响应时自动发送
			response.addCookie(c1);
	}

}
