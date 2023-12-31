import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TotalController extends CoffeeShop implements Initializable {

    @FXML
    Button newOrderButton;

    @FXML
    Button closeButton;

    @FXML
    Text total;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        double cost = order.makeCoffee();
        orderText = orderText + "Total: $" + String.format("%.2f", cost);
        total.setText(orderText);
    }

    public void closeButtonClick(ActionEvent e) throws IOException {
        System.exit(1);
    }

    public void newOrderButtonClick(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Myfxml.fxml"));
        root.getStylesheets().add("/styles/style1.css");
        Stage window = (Stage) newOrderButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 600));
        orderText = "";
    }
}
