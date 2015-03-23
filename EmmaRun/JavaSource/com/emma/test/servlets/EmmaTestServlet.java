package com.emma.test.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmmaTestServlet extends HttpServlet implements Servlet {
	public EmmaTestServlet() {
		super();
	}

	
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		doPost(arg0, arg1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int param1 = Integer.parseInt(request.getParameter("param1"));
		
		int param2 = Integer.parseInt(request.getParameter("param2"));
		
		boolean returnedValue = doSomething(param1, param2);
		
		request.setAttribute("output", new Boolean(returnedValue));
		
		String nextJSP = "/input.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
	}
	
	private boolean doSomething(int param1, int param2) {
		if (param1 == 1) {
			return false;
		}
		if (param2 == 1) {
			return false;
		}
		return true;
	}

}