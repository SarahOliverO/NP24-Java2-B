package br.com.senaisp.bauru.sarah.licao09.exemplo01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CriacaoBotoes extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Button btn01 = new Button();
		Button btn02 = new Button("222");
		
		btn01.setText("Olá Mundo!");
		btn01.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Olá mundo clicado!");
			}
		});
		//Criando a scena
		Group root = new Group();
		//criando a cena com 800 X 600
		Scene scena = new Scene (root,800,600);
		//Adicionando os componentes ao nó root
		root.getChildren().add(btn01);
		root.getChildren().add(btn02);
		//Posicionando no eixo Y em 100 pixels
		btn01.setLayoutY(100);
		
		
		//Finalizando a configuração da janela
		primeiraStage.setScene(scena);
		primeiraStage.setTitle("Titulo da Janela");
		//Mostrando a janela
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
