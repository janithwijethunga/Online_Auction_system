package com.dilivers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Diliverupdate")
public class Diliverupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set deliver details and updates
		String id = request.getParameter("diliverid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = DiliverDBUtil.updatediliver(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			response.sendRedirect(request.getContextPath() + "/diliverlist");
		}
		else {
			List<Diliver> diliverDetails = DiliverDBUtil.getDiliverDetails(id);
			request.setAttribute("diliverDetails", diliverDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("diliveraccount.jsp");
			dis.forward(request, response);
		}
	}

}
