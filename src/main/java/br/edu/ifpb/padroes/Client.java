package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.DebitStrategy;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class Client {
	private PaymentStrategy payment;
	public static void main(String[] args) {
    	
   
    	
        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        orderManager.payOrder(payment.pagar(new DebitStrategy()));
        orderManager.cancelOrder();

    }
}
