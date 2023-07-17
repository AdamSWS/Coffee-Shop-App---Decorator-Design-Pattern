import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CoffeeShop extends Application {

	static Coffee order;
	static String orderText = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		order = new Coffee() {
			@Override
			public double makeCoffee() {
				return 0;
			}
		};
		try {
			// TODO Auto-generated method stub
			primaryStage.setTitle("Adam Shaar's Coffee Shop");
			Parent root = FXMLLoader.load(getClass()
					.getResource("/FXML/Myfxml.fxml"));
			Scene s1 = new Scene(root, 600,600);
			s1.getStylesheets().add("/styles/style1.css");
			primaryStage.setScene(s1);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		//Coffee order = new Sugar(new Cream( new ExtraShot(new BasicCoffee())));
		
		//double cost = order.makeCoffee();
		//System.out.println("Total: "+cost);
	}

}
