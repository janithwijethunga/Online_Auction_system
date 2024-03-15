package com.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/DeleteItems")
public class DeleteItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set item details and delete
		String id = request.getParameter("itemid");
		boolean isTrue;
		
		isTrue = ItemDBUtil.deleteitem(id);
		
		if (isTrue == true) {
			// get the updated item data from the database
            List<Item> itemDetails = ItemDBUtil.getItemDetails();

         // Set the updated data as an attribute in the request
            request.setAttribute("itemDetails", itemDetails);

            RequestDispatcher dispatcher = request.getRequestDispatcher("allItems.jsp");
            dispatcher.forward(request, response);
		}
		else {
			
			List<Item> itemDetails = ItemDBUtil.getItemDetails(id);
			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
	}

}
