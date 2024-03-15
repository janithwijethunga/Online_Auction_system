package cn.web.model;

public class Order extends Product {

	private int orderId;
	private int uid;
	private int quantity;
	private String date;
	
	
	public Order() {}
	
	public Order(int orderId, int uid, int quantity, String date) {
		super();
		this.orderId = orderId;
		this.uid = uid;
		this.quantity = quantity;
		this.date = date;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getUid() {
		return uid;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getDate() {
		return date;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", uid=" + uid + ", quantity=" + quantity + ", date=" + date + "]";
	}
	
	

	
}
