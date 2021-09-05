package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public enum OrderStatusEnum implements OrderStatus {
	IN_PROGRESS {
		@Override
		public OrderStatus notificarEmail() {
			EmailNotification emailNotification = new EmailNotification();
			emailNotification.sendMailNotification(String.format("Order %d in progress", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));
			logService.info("in progress");
			return null;
		}

		@Override
		public OrderStatus alterarStatus() {
			order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
			return null;

		}
	},
	CANCELED {

		@Override
		public OrderStatus notificarEmail() {
			EmailNotification emailNotification = new EmailNotification();
			emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));
			logService.info("payment finished");
			return null;
		}

		@Override
		public OrderStatus alterarStatus() {
			Order order;
			order.setarStatus(PAYMENT_SUCCESS);
			return null;
		}

	},
	PAYMENT_SUCCESS {
		@Override
		public OrderStatus notificarEmail() {
			EmailNotification emailNotification = new EmailNotification();
			emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));
			logService.info("payment finished");
			return null;
		}

		@Override
		public OrderStatus alterarStatus() {
			order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
			return null;

		}
	},
	PAYMENT_REFUSED {

		@Override
		public OrderStatus notificarEmail() {
			EmailNotification emailNotification = new EmailNotification();
			emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));
			logService.info("payment finished");
			return null;
		}

		@Override
		public OrderStatus alterarStatus() {
			// TODO Auto-generated method stub
			return null;
		}

	};
}
