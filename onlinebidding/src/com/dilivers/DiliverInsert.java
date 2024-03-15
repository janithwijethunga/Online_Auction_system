package com.dilivers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DiliverInsert")
public class DiliverInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//set deliver details
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		
		//create direction
		isTrue = DiliverDBUtil.insertdiliver(name, email, phone, username, password);
		
		if(isTrue == true) {
			response.sendRedirect(request.getContextPath() + "/diliverlist");
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
