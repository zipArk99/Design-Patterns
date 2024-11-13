package com.app.example;

public class OrderFacade {
	private final ProductDao productDao;
	private final Payment payment;
	private final SendNotification sendNotification;
	private final Invoice invoice;

	public OrderFacade() {
		this.productDao = new ProductDao();
		this.invoice = new Invoice();
		this.sendNotification = new SendNotification();
		this.payment = new Payment();
	}

	public void createOrder() {
		Product product = productDao.getProductById(12);
		payment.makePayment();
		invoice.generateInvoice();
		sendNotification.send();

	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public Payment getPayment() {
		return payment;
	}

	public SendNotification getSendNotification() {
		return sendNotification;
	}

	public Invoice getInvoice() {
		return invoice;
	}

}
