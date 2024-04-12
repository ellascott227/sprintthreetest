import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Halfmain extends Application{

	@Override
	public void start(Stage stage) throws Exception{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Halfmain.class.getResource("views/mainview.fxml"));
		
		Pane view = loader.load();
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
