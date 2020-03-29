package com.edureka;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWebApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
            resp.setContentType("text/plain");
            resp.getWriter().write("Hello from Edureka !\n\n\nDemo Java Project for Edureka DevOps certification from Prashant Beniwal..\n\n");
        }


        public int add(int a, int b) {
            return a + b + 1;
        }

	public int sub(int a, int b) {
            return a - b;
        }

	public int mul(int a, int b) {
            return a * b;
        }

}
