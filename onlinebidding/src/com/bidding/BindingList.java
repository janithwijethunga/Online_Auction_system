package com.bidding;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/BindingList")
public class BindingList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Binding> bindDetails = BindingDBUtil.getBindingDetails(); // Retrieve user details from the database

	        // Set bidding details
	        request.setAttribute("bindDetails", bindDetails);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("allbinding.jsp");
	        dispatcher.forward(request, response);
	}

}
