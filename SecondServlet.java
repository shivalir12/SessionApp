package com.nc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/SecondServlet", "/second.html" })
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String fname=request.getParameter("fname");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("fname", fname);
		
		/*Cookie fnck=new Cookie("fname",fname);
		fnck.setMaxAge(5*60);
		response.addCookie(fnck);*/
		
		out.println("<b>Enter your last name:</b>");
		out.println("<form method= 'post' action ='final.html'> ");
		//out.println("<input type='hidden' name='fname' value='"+fname+"'/>");//
		out.println("<input type='text' name='lname'/>");
		out.println("<input type='submit' value='Submit'/>");
		out.println("</form>");
		 
	}

}
