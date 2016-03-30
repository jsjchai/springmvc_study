/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jquery.userverify;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 注解WebServlet用来描述一个Servlet
 * 属性name描述Servlet的名字,可选
 * 属性urlPatterns定义访问的URL,或者使用属性value定义访问的URL.(定义访问的URL是必选属性)
 */
@SuppressWarnings("serial")
@WebServlet(name="UserVerifyServlet",urlPatterns="/UserVerifyServlet")
public class UserVerify extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String param = request.getParameter("userName");
            if (param == null || param.length() == 0) {
                out.println("用户名不能为空");
            } else {
            	System.out.println(param);
            	//使用指定的编码机制对 application/x-www-form-urlencoded 字符串解码
                String userName = URLDecoder.decode(param, "UTF-8");
                System.out.println(userName);
                if (userName.equals("chai")) {
                    out.println("用户名[" + userName + "]已经存在，请使用别的用户名注册");
                } else {
                    out.println("可以使用用户名[" + userName + "]注册");
                }
            }
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
