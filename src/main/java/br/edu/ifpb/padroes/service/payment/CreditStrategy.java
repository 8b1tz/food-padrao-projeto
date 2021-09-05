package br.edu.ifpb.padroes.service.payment;

public class CreditStrategy implements PaymentStrategy{

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return "foi pago com Crédito";
	}

}
