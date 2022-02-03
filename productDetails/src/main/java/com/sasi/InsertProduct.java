package com.sasi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertProduct extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String pprice= request.getParameter("pprice");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.print("<h1>Prodcut Details</h1>");
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>");
		out.println("<tr><td>"+pid+"</td> <td>"+pname+"</td> <td>"+pprice+"</td></tr></table>");
		
		
		
	}

}