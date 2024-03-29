package br.com.senaisp.bauru.sarah.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//Instanciando terminal
		Terminal tm = new Terminal();
		//Carregando saldo para os cartões
		tm.carregarCartao(ct01, 50);
		tm.carregarCartao(ct02, 100);
		//Criando duas maquinas de jogo
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		MaquinaFliperama m2 = new MaquinaFliperama("LOL");
		//Usar as maquinas
		System.out.println("Jogando....\n\n\n");
		m1.lerCartao(ct01);
		m2.lerCartao(ct02);
		System.out.println("Segunda rodada de jogos....\n\n\n");
		m1.lerCartao(ct01);
		m1.lerCartao(ct02);
		System.out.println("Tranferindo o saldo do cartão 1 para o 2....\n\n\n");
		tm.transferirCreditos(ct01, ct02);
		System.out.println("Tentar jogar com o cartão 1....\n\n\n");
		m1.lerCartao(ct01);
		System.out.println("Tranferir um pouco para o cartão 1....\n\n\n");
		tm.transferirCreditos(ct02, ct01, 10);
		System.out.println("Consultar saldo de prêmios...\n\n\n");
		tm.consultarPremios();
		System.out.println("Resgatando um dos prêmios");
		tm.resgtarPremio(ct01, 1);
		
	}
}
