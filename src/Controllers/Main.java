package Controllers;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("/Views/Login.fxml"));;
			Scene scene = new Scene(root,400,550);
			primaryStage.setTitle("Proyecto2");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeToUserEdit(String userName) {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/Views/UserEdit.fxml"));
			Parent newScene = loader.load();
			//Se envian los datos del usuario
			UserEditController uec = loader.getController();
			uec.setUserLoggedIn(userName);
			uec.llenarClase();
			
			Scene scene = new Scene(newScene,400,550);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
