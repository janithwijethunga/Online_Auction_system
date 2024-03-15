package com.bidding;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Bidlistadmin")
public class Bidlistadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Binding> bindDetails = BindingDBUtil.getBindingDetails(); // Retrieve user details from the database

	        // Set the list of bidding details
	        request.setAttribute("bindDetails", bindDetails);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("bidlistadmin.jsp");
	        dispatcher.forward(request, response);
	}

}
