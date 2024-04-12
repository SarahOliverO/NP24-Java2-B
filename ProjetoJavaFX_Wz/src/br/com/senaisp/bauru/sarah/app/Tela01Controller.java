package br.com.senaisp.bauru.sarah.app;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Tela01Controller {

	@FXML TextField txtCodigo;
	@FXML TextField txtDescricao;
	@FXML TextField txtSaldo;
	@FXML TextField txtCusto;
	
	@FXML Button btnGravar;
	@FXML Button btnCancelar;
	
	@FXML public void btnGravarAct() {
		System.out.println("Gravei");
		Main.mainStage.setScene(Main.mainScene);
	}
	@FXML public void btnCancelarAct() {
		System.out.println("Cancelei");
		Main.mainStage.setScene(Main.mainScene);
	}

}
