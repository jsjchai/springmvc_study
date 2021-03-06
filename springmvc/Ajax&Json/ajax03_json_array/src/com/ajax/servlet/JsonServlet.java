package com.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/jsonServlet")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		//String jsonResult="{\"name\":\"张三\",\"age\":22}";
		JSONObject jsonResult=new JSONObject();
		jsonResult.put("students",getJsonArray());
		PrintWriter out=resp.getWriter();
		out.print(jsonResult);
		out.flush();
		out.close();
	}
	
	private JSONArray getJsonArray() {
		JSONArray array=new JSONArray();
		array.add(getJsonObject("张三",23));
		array.add(getJsonObject("李四",24));
		array.add(getJsonObject("李勇",25));
		return array;
	}
	
	private JSONObject getJsonObject(String name,int age){
		JSONObject student=new JSONObject();
		student.put("name",name);
		student.put("age", age);
		return student;
	}

}
