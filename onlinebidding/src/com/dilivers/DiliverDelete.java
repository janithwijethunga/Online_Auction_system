package com.dilivers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.item.Item;
import com.item.ItemDBUtil;

@WebServlet("/DiliverDelete")
public class DiliverDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get deliver details and delete
		String id = request.getParameter("diliverid");
		boolean isTrue;
		
		isTrue = DiliverDBUtil.deleteDiliver(id);
		
		if (isTrue == true) {
			response.sendRedirect(request.getContextPath() + "/diliverlist");
		}
		else {
			
			List<Diliver> diliverDetails = DiliverDBUtil.getDiliverDetails(id);
			request.setAttribute("diliverDetails", diliverDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("diliveraccount.jsp");
			dispatcher.forward(request, response);
		}
	}

}
