package br.com.senaisp.bauru.sarah.licao05.exercico;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da cor: (1,2 ou 3):");
		int codigo = sc.nextInt();
		String cor = "Cor inválida";
		switch (codigo) {
		case 1 -> cor = "Próxima luz do semáforo será verde";
		case 2 -> cor = "Próxima luz do semáforo será amarelo";
		case 3 -> cor = "Próxima luz do semáforo será vermelho";
		}
		//Outra forma de usar o switch : , sendo obrigatorio colocar o break;
		/*
		switch (codigo) {
		case 1 : cor = "Próxima luz do semáforo será verde"; break;
		case 2 : cor = "Próxima luz do semáforo será amarelo"; break;
		case 3 : cor = "Próxima luz do semáforo será vermelho"; break;
		}
		*/
		System.out.println(cor);
		sc.close();
	}

}
