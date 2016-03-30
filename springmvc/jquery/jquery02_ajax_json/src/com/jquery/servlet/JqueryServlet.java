package com.jquery.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

@WebServlet("/jqueryServlet")
public class JqueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		String action=request.getParameter("action");
		if("load".equals(action)){
			load(request, response);
		}else if("post".equals(action)){
			post(request, response);
		}
	}

	private void load(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("load-->jquery-->¾«Éñ´ò»÷");
	}
	
	private void post(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println("name="+name);
		System.out.println("age="+age);
		//PrintWriter out=response.getWriter();
		JSONObject jsonResult=new JSONObject();
		jsonResult.put("name", name);
		jsonResult.put("age", age);
		PrintWriter out=response.getWriter();
		out.print(jsonResult);
		out.flush();
		out.close();
	}
}
