/**
 * 
 */
package web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 
 * @author wentao
 */
public class myListener implements ServletRequestListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestListener#requestDestroyed(javax.servlet.ServletRequestEvent)
	 */
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("����");

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestListener#requestInitialized(javax.servlet.ServletRequestEvent)
	 */
	public void requestInitialized(ServletRequestEvent e) {
		System.out.println("��ʼ��");
		System.out.println(e.getServletRequest());

	}

}
