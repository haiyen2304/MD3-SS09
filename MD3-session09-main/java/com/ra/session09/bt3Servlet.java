package com.ra.session09;

import com.ra.model.UserData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bt3Servlet", value = "/bt3-servlet")
public class bt3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect("bt3.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userFix = "duchai";
        String passFix = "123456";
        String username = request.getParameter("user");
        String password = request.getParameter("pwd");
        if(username.equals(userFix) && password.equals(passFix)) {
            response.sendRedirect("bt2.jsp");
        }
    }
}
