package br.com.senaisp.bauru.sarah.licao09.exemplo03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class CoresEFormas extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		//Criando componentes
		criarComponentes(root);
		//Criando a scena
		Scene scena = new Scene(root,600,400,Color.BLACK);
		//Configurando a stage
		primeiraStage.setTitle("Cores e Formas");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarComponentes(Group root) {
		LinearGradient lg = new LinearGradient (
				//StartX, StartY, EndX, EndY, Proporcional?,Forma de ciclo de gradiente, Stops
				0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop [] {
						new Stop (0,Color.BLACK),
						new Stop (0.5,Color.PURPLE),
						new Stop (1,Color.ROSYBROWN)
				});
		RadialGradient rg = new RadialGradient(0, 0, 0.5, 0.5, 1, true, CycleMethod.NO_CYCLE, new Stop [] {
				new Stop(0, Color.PURPLE),
				new Stop(0.25, Color.ROSYBROWN),
				new Stop(0.5, Color.TRANSPARENT)
		});
		Polygon pir = new Polygon(new double[] {
				210.0, 10.0,
				210.0, 210,0,
				10.0, 210.0
		});
		//pir.setFill(Color.rgb(148, 0, 211));
		pir.setFill(lg);
		//Posicionando o triangulo
		pir.setLayoutX(200);
		//Colocando no nó root
		root.getChildren().add(pir);
		
	}

}
