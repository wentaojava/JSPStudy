/**
 * 
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**模拟打开首页请求
 * 
 * @author wentao
 */
public class IndexServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//浏览器访问时自动传入保存的Cookie
		Cookie[] cookies=req.getCookies();
		if(cookies != null) {
			res.setContentType("text/html;charset=utf-8");
			PrintWriter p=res.getWriter();
			for(Cookie c : cookies) {
				//System.out.println(c.getName()+"按"+c.getValue());
				p.println(c.getName()+":"+c.getValue());
			}
			p.close();
		}
	}

}
