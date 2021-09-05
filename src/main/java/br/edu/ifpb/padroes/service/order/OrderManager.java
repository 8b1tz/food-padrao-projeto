package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.payment.DebitStrategy;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class OrderManager {

	public OrderManager(Order order) {
		this.order = order;
	}

	private Order order;

	private PaymentStrategy payment = new DebitStrategy();

	public void payOrder(PaymentStrategy payment) {

		try {
			payment.pagar();

		} catch (Exception e) {

		}
	}

	public void cancelOrder() {

	}

}
