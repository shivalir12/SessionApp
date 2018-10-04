package com.nc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
@WebServlet({ "/FinalServlet", "/final.html" })
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		HttpSession session=request.getSession();
		String fname=(String)session.getAttribute("fname");
		
		
		//String fname=request.getParameter("fname");
		/*Cookie[] cookies=request.getCookies();
		String fname= "";
		for(Cookie ck:cookies) {
			if(ck.getName().equals("fname"))
			{
				fname=ck.getValue();
			}
			
		}*/
			
			
		String lname=request.getParameter("lname");
		
		response.setContentType("text/html");
		String message = "<h2>Welcome "+fname+ " "+ lname+ "</h2>";
		
		response.getWriter().println(message);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
		
	}

}
