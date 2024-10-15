package com.ra.session09;

import com.ra.model.UserData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bt2Servlet", value = "/bt2-servlet")
public class bt2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserData user = new UserData(1,20,"Duc Hai","hai@gmail.com");
        request.setAttribute("user", user);
        request.getRequestDispatcher("bt2.jsp").forward(request,response);
    }
}
