package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(); // Retrieve user details from the database

        // Set the list of user details as an attribute in the request
        request.setAttribute("cusDetails", cusDetails);

        RequestDispatcher dispatcher = request.getRequestDispatcher("allCustomers.jsp");
        dispatcher.forward(request, response);
    }
}
