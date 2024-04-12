module ProjetoJavaFX_Wz {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.sarah.app to javafx.graphics, javafx.fxml;
}
