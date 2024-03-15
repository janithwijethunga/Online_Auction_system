package com.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SellerDelete")
public class SellerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get seller details and delete
		String id = request.getParameter("sellerid");
		boolean isTrue;
		
		isTrue = SellerDBUtil.deleteSeller(id);
		
		if (isTrue == true) {
			// Re-fetch the updated seller data from the database
		    List<Seller> sellerDetails = SellerDBUtil.getSellerDetails();

		    // Set the updated data as an attribute in the request
		    request.setAttribute("sellerDetails", sellerDetails);

		    // Forward to Sellerlist.jsp
		    RequestDispatcher dispatcher = request.getRequestDispatcher("Sellerlist.jsp");
		    dispatcher.forward(request, response);
		}
		else {
			
			List<Seller> sellerDetails = SellerDBUtil.getSellerDetails(id);
			request.setAttribute("sellerDetails", sellerDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("selleraccount.jsp");
			dispatcher.forward(request, response);
		}
	}

}
