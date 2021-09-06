package br.edu.ifpb.padroes.domain;

public interface EventListener {

	public void sendMailNotification(String message,Customer customer);

	public void sendMailNotification(String message);
}
