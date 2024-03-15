package cn.web.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.web.model.Cart;

/**
 * Servlet implementation class QuantityIncDecSevlet
 */
@WebServlet("/quantity-inc-dec")
public class QuantityIncDecSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//out.println("inc dec servlet");
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter();){
			String action = request.getParameter("action");
			int id = Integer.parseInt(request.getParameter("id"));
			
			ArrayList<Cart> cart_list = (ArrayList<Cart>) request.getSession().getAttribute("cart-list");
			
			if(action != null && id>=1) {
				if(action.equals("inc")) {
					for(Cart c:cart_list) {
						if(c.getId() ==id) {
							int quantity = c.getQuantitty();
							quantity++;
							c.setQuantitty(quantity);
							response.sendRedirect("cart.jsp");
							
						}
					}
				}
				
				
					if(action.equals("dec")) {
						for(Cart c:cart_list) {
							if(c.getId() ==id && c.getQuantitty() >1) {
								int quantity = c.getQuantitty();
								quantity--;
								c.setQuantitty(quantity);
								break;
								
							}
						}
						response.sendRedirect("cart.jsp");
					}
			}else {
				response.sendRedirect("cart.jsp");
			}
			
			
		}
		
	}

}
