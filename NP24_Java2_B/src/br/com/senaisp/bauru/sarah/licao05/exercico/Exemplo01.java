package br.com.senaisp.bauru.sarah.licao05.exercico;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 17;
		boolean bPodeDirigir = ! (idade < 18 || idade > 65);
								//idade >= 18 && idade <= 65
		System.out.println("Você " + (bPodeDirigir ? "Pode" : "Não Pode" )+ " Dirigir");
		
	}

}
