package cn.itcast.firstapp.servlet;
import java.io.*;
import javax.servlet.*;

public class HelloWorldServlet extends GenericServlet {
	public void service(ServletRequest request, ServletRequest response)
	   throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}