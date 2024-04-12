package br.com.senaisp.bauru.sarah.app;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Tela01Main extends Pane {
	private Scene scena;
	public Tela01Main() throws IOException {
		Pane tela01 = (Pane)FXMLLoader.load(getClass().getResource("Tela01.fxml"));
		this.getChildren().add(tela01);
		scena = new Scene(this,800,600);
		scena.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}
}
