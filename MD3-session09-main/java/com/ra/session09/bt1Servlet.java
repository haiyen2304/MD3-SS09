package com.ra.session09;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "displaydiscount", value = "/bt1-servlet")
public class bt1Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.sendRedirect("WEB-INF/bt1.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String discount = request.getParameter("discount");
        double discountAmount = Integer.parseInt(price) * 0.1;
        double discountPrrice = Double.parseDouble(price)- discountAmount;
        request.setAttribute("des",description);
        request.setAttribute("price",price);
        request.setAttribute("discount",discount);
        request.setAttribute("discountAmount",discountAmount);
        request.setAttribute("discountPrice",discountPrrice);
        request.getRequestDispatcher("bt1-display.jsp").forward(request,response);
    }

    public void destroy() {
    }
}
