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
			//Cookie��ֻ�ܴ�һ�����ݣ���ֻ�ܴ��ַ���
			Cookie c1=new Cookie("user",user);
			//��Cookie�󶨵�reponse�У���������Ӧʱ�Զ�����
			response.addCookie(c1);
	}

}
