package br.edu.ifpb.padroes.domain;

public interface OrderStatus {
	OrderStatus notificarEmail();
	OrderStatus informacaoDoLog();
	OrderStatus alterarStatus();
	
}
