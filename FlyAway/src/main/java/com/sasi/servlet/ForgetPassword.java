package com.sasi.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flightbooking.sasi.database.ConnectionUtil;

/**
 * Servlet implementation class ForgetPassword
 */
@WebServlet("/ForgetPassword")
public class ForgetPassword extends HttpServlet {
	public class ForgotPassword extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
		ConnectionUtil dao=new ConnectionUtil();
		HttpSession session=request.getSession();
		if(dao.changeAdminPassword(email,password)) {
		session.setAttribute("message", "Password Changed bSuccessfully");
		}
		else {
		session.setAttribute("message", "Invalid Details");
		}
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		response.sendRedirect("AdminPage.jsp");
		}
		}
}