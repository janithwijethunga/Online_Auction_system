package cn.web.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.web.connection.DbCon;
import cn.web.dao.OrderDao;
import cn.web.model.Cart;
import cn.web.model.Order;
import cn.web.model.User;


@WebServlet("/order-now")
public class orderNowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				
				Date date = new Date();
				
				
			
				User auth = (User) request.getSession().getAttribute("auth");
				if(auth != null) {
					String productId = request.getParameter("id");
					int productQuantity = Integer.parseInt(request.getParameter("quantity"));
					if(productQuantity <=0) {
						productQuantity = 1;
					}
					
					
					Order ordermodel = new Order();
					ordermodel.setId(Integer.parseInt(productId));
					ordermodel.setUid(auth.getId());
					ordermodel.setQuantity(productQuantity);
					ordermodel.setDate(formatter.format(date));
					
					OrderDao orderDao = new OrderDao(DbCon.getConnection());
					boolean result = orderDao.insertorder(ordermodel);
					
					if(result) {
						
						ArrayList<Cart> cart_list = (ArrayList<Cart>) request.getSession().getAttribute("cart-list");
						if(cart_list != null) {
							for(Cart c:cart_list) {
								if(c.getId()==Integer.parseInt(productId)) {
									cart_list.remove(cart_list.indexOf(c));
									break;
								}
							}
							
						}
						response.sendRedirect("cart.jsp");
						
						
						response.sendRedirect("order.jsp");
					}else {
						out.print("order failed");
					}
					
				
				
				}else {
					response.sendRedirect("login.jsp");
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
