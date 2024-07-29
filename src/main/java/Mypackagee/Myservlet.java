package Mypackagee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Myservlet
 */
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("num1");
		String str1=request.getParameter("num2");
		String str2=request.getParameter("btn1");
		// typecasting -convert string into integer
		int a= Integer.parseInt(str);
		int b= Integer.parseInt(str1);
		int ans;
		if(str2.equals("1")) ans= a+b;
		else if(str2.equals("2")) ans=a-b;
		else if(str2.equals("3")) ans=a*b;
		else ans=a/b;
		//response.getWriter().append("Ans ="+ans);
		response.sendRedirect("NewFile.jsp?ans="+ans);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
