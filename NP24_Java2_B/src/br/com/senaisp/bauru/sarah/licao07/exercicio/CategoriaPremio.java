package br.com.senaisp.bauru.sarah.licao07.exercicio;

import java.util.Random;

public class CategoriaPremio {
	private String nome;
	private int qtdeTickets;
	private int saldoPremio;
	//Constructor
	public CategoriaPremio (String nm, int sld) {
		nome = nm;
		saldoPremio = sld;
		Random rnd = new Random();
		qtdeTickets = rnd.nextInt(10)+1;
		
	}
	//Getters e Setters
	public int getSaldoPremio() {
		return saldoPremio;
	}
	public void setSaldoPremio(int saldoPremio) {
		this.saldoPremio = saldoPremio;
	}
	public String getNome() {
		return nome;
	}
	public int getQtdeTickets() {
		return qtdeTickets;
	}
	@Override
	public String toString() {
		return "=".repeat(30)+"\n"+
				"Categoria Nome: " + getNome()+"\n"+
				"Custo tickets: "+getQtdeTickets()+"\n"+
				"Saldo Prêmios: "+getSaldoPremio();
	}
}
