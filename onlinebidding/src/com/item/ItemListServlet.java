package com.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ItemListServlet")
public class ItemListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Item> itemDetails = ItemDBUtil.getItemDetails();
		 
		 // Set the list of item details 
	        request.setAttribute("itemDetails", itemDetails);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("allItems.jsp");
	        dispatcher.forward(request, response);
	}
}
