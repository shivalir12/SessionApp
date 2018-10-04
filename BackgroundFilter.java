package com.nc.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

 
@WebFilter("*.html")
public class BackgroundFilter implements Filter {
 
    public BackgroundFilter() {
         
    }

	 
	public void destroy() {
		 
	}

	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 //this code will be processed at request
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<body style='background-color:yellow'>");
		out.println("<h1 style='text-align:center'>NETCRACKER</h1>");
		out.println("<hr>");
		chain.doFilter(request, response);
		//this code will be processed at response
		out.println("</hr>");
		out.println("<h4 style='text-align:right'>@Copyright:NETCRACKER</h4>");
		out.println("</body >");
	}

	 
	public void init(FilterConfig fConfig) throws ServletException {
		 
	}

}
