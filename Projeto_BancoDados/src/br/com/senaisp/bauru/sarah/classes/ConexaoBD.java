package br.com.senaisp.bauru.sarah.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static ConexaoBD instancia = null;
	private Connection conn;
	//Colocando o constructor como privado para criar somente aqui
	private ConexaoBD() throws SQLException {
		conn = DriverManager.getConnection("jdbc:sqlite:C:\\Javalibs\\dados\\NP24_JAVA2_B");
	}
	//Obtendo a instancia de forma padrão singleton
	public static ConexaoBD getInstancia() throws SQLException {
		if (instancia == null) {
			instancia = new ConexaoBD();
		}
		return instancia;
	}
	public Connection getConn() {
		return conn;
	}
}
