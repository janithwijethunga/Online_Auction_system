package com.dilivers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Diliverlist")
public class Diliverlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//set deliver list to show
		List<Diliver> diliverDetails = DiliverDBUtil.getDiliverDetails(); // Retrieve user details from the database

        request.setAttribute("diliverDetails", diliverDetails);

        RequestDispatcher dispatcher = request.getRequestDispatcher("diliverlist.jsp");
        dispatcher.forward(request, response);
	}

}
