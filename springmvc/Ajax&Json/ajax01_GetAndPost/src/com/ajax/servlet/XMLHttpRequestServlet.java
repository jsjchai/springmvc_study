package com.ajax.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xmlHttpRequestServlet")
public class XMLHttpRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println("name="+name);
		System.out.println("age="+age);
		
//		PrintWriter printWriter=response.getWriter();
//		printWriter.print("xmlHttpRequest");
	}
}
