package br.com.senaisp.bauru.sarah.licao06.lacowhile;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		int tentativas = 0;
		final int PASSWORD = 1597;
		do {
			System.out.println("Favor digitar a senha:");
			senha = sc.nextInt();
			if (senha!=PASSWORD) {
				System.out.println("Senha inválida! Redigite.");
				tentativas++;
			}
		}while(senha!=PASSWORD && tentativas<3);
		//Inicio do if
		if (tentativas<3) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso bloqueado!");
		}//fim do else
		sc.close();
	}

}
