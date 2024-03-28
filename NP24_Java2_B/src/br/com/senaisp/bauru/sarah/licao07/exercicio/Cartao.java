package br.com.senaisp.bauru.sarah.licao07.exercicio;

public class Cartao {
	private static int contador=0;
	private int numero;
	private int credito;
	private int tickets;
	//Constructor
	public Cartao() {
		numero = ++contador;
		credito = 0;
		tickets = 0;
		
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "=".repeat(20)+"\n"+
				"Nr. Cartão: " + getNumero()+"\n"+
				"Saldo Créditos: " + getCredito()+"\n"+
				"Saldo Tickets: " + getTickets()+"\n";
	}
}
