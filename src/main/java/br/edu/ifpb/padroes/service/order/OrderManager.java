package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.payment.DebitStrategy;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class OrderManager {

	public OrderManager(Order order) {
		this.order = order;
	}

	private Order order;

	private EmailNotification emailNotification = new EmailNotification();

	private PaymentStrategy payment = new DebitStrategy();

	private LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));

	public void payOrder(PaymentStrategy payment) {

		try {
			payment.pagar();

		} catch (Exception e) {

		}
	}

	public void cancelOrder() {

	}

}
