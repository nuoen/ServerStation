package com.nuoen.ServerStation;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TestServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello World , To Meet You: " + System.currentTimeMillis();
        System.out.println("servlet init");
        super.init();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.write("<h1>" + message + "</h1>");
        destroy();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
        super.destroy();
    }
}