package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	//doGet方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.doPost(request, response);
	}

	//doPost方法
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName() +":"+request.getServerPort()+path+"/";
		String username="";
		String password="";
		request.setCharacterEncoding("utf-8");
		username=request.getParameter("username");
		password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		if("wangjinpeng".equals(username) && "18161402049".equals(password)){
			 HttpSession session=request.getSession();
			 session.setAttribute("loginUsername", username);
			 session.setAttribute("loginUser",username);
			 request.getRequestDispatcher("login_success.jsp").forward(request,response);
			 
		}else{
			response.sendRedirect("login_failure.jsp");
		}

	}


}
