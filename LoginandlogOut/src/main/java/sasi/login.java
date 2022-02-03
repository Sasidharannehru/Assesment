package sasi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		
		HttpSession session= request.getSession();
		
		
		if(userName.trim().endsWith("sasi")&&password.trim().equals("12345")) {
			
			session.setAttribute("userName", userName);
			
			response.sendRedirect("dashboard");
			
		
		
				
			}
		else {
			out.println("<font color='red'>Invalid username...</font>");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("NewFile.html");
			dispatcher.include(request, response);
		}
		
			
		}
		
		
	}


