package com.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UpdateItemServlet")
public class UpdateItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set item details and update
		String id = request.getParameter("itemid");
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String image = request.getParameter("image");
		
		
		boolean isTrue;
		
		isTrue = ItemDBUtil.updateitems(id, name, category, price, image);
		
		if(isTrue == true) {
			
			// read the updated item data from the database
            List<Item> itemDetails = ItemDBUtil.getItemDetails();

         // Set the updated data 
            request.setAttribute("itemDetails", itemDetails);

            RequestDispatcher dispatcher = request.getRequestDispatcher("allItems.jsp");
            dispatcher.forward(request, response);
		}
		else {
//			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
//			request.setAttribute("cusDetails", cusDetails);
			
			List<Item> itemDetails = ItemDBUtil.getItemDetails(id);
			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}
