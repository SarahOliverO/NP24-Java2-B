package br.com.senaisp.bauru.sarah.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//Criando uma máquina
		MaquinaFliperama ml = new MaquinaFliperama("MK1");
		ml.lerCartao(ct01);
		
	}

}
