package com.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sellerlist")
public class Sellerlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Seller> sellerDetails = SellerDBUtil.getSellerDetails();// Retrieve user details from the database

		// Set the list of seller details
        request.setAttribute("sellerDetails", sellerDetails);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Sellerlist.jsp");
        dispatcher.forward(request, response);
	}

	
	

}
