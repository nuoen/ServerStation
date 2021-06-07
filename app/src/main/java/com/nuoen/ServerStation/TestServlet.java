package com.nuoen.ServerStation;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TestServlet extends HttpServlet {
    private String message;
    public String getHello() { return "Hello Gradle Web Application"; }
    public void init() throws ServletException{
        //执行必须的初始化
        message="Hello Servlet";
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>"+message+"<h1>");
    }

    public void destroy(){

    }
}