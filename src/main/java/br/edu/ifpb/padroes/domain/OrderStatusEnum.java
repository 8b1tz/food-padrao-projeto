package br.edu.ifpb.padroes.domain;

public enum OrderStatusEnum implements OrderStatus {
	IN_PROGRESS {
		@Override
		public OrderStatus notificarEmail() {
			emailNotification.sendMailNotification(String.format("Order %d in progress", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			logService.debug(String.format("order %d in progress", order.getId()));
		}

		@Override
		public OrderStatus alterarStatus() {
			order.setStatus(Order.OrderStatus.IN_PROGRESS);
		}
	},
	CANCELED {

		@Override
		public OrderStatus notificarEmail() {
			order.setStatus(Order.OrderStatus.CANCELED);
		}

		@Override
		public OrderStatus informacaoDoLog() {
			emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
		}

		@Override
		public OrderStatus alterarStatus() {
			logService.debug(String.format("order %d canceled", order.getId()));
		}

	},
	PAYMENT_SUCCESS {
		@Override
		public OrderStatus notificarEmail() {
			emailNotification.sendMailNotification(String.format("Order %d completed successfully",order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			logService.info("payment finished");
		}

		@Override
		public OrderStatus alterarStatus() {
			order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
			
		}
	},
	PAYMENT_REFUSED{

		@Override
		public OrderStatus notificarEmail() {
			emailNotification.sendMailNotification(String.format("Order %d refused", order.getId()));
		}

		@Override
		public OrderStatus informacaoDoLog() {
			logService.error("payment refused");
		}

		@Override
		public OrderStatus alterarStatus() {
			order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
		}

	};
}
