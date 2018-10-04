package com.nc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FirstServlet", "/first.html" })
public class FirstServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    
  
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		out.println("<b>Enter your first name:</b>");
		out.println("<form action ='second.html'> ");
		out.println("<input type='text' name='fname'/>");
		out.println("<input type='submit' name='Submit'/>");
		out.println("</form>");
		
		

	}

	
	
	}


