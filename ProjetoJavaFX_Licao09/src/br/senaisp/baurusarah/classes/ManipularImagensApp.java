package br.senaisp.baurusarah.classes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ManipularImagensApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		criarComponentes(root);
		Scene scena = new Scene(root,800,600,Color.BEIGE);
		primeiraStage.setTitle("Manipulando mídias");
		primeiraStage.setScene(scena);
		primeiraStage.show();
		
	}

	private void criarComponentes(Group root) {
		Duke dk01 = new Duke();
		dk01.setLayoutX(20);
		dk01.setLayoutY(20);
		
		//Colocando os itens necessarios para o video
		Media video = new Media(getClass().getResource("videos/video.mp4").toString());
		MediaPlayer mp = new MediaPlayer(video);
		//visualizador do video/audio
		MediaView mvw = new MediaView(mp);
		//Dimensionar o media view
		mvw.setFitWidth(600);
		mvw.setFitHeight(400);
		mvw.setPreserveRatio(true);
		
		mvw.setX(100);
		mvw.setY(100);
		
		Button btnPlay = new Button("Play");
		Button btnPause = new Button("Pause");
		Button btnStop = new Button("Stop");
		//Posicionando botoes
		btnPlay.setLayoutX(100);
		btnPause.setLayoutX(200);
		btnStop.setLayoutX(300);
		
		btnPlay.setLayoutY(450);
		btnPause.setLayoutY(450);
		btnStop.setLayoutY(450);
		
		btnPlay.setOnAction((ev)->{ mp.play();});
		btnPause.setOnAction((ev)->{ mp.pause();});
		btnStop.setOnAction((ev)->{ mp.stop();});
		
		root.getChildren().addAll(dk01,mvw,btnPlay,btnPause,btnStop);
	}
	

}
