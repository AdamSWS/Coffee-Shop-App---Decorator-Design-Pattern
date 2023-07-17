import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OrderController extends CoffeeShop implements Initializable {

    @FXML
    Button basicCoffeeButton;

    @FXML
    Button creamButton;

    @FXML
    Button sugarButton;

    @FXML
    Button xshotButton;

    @FXML
    Button oreosButton;

    @FXML
    Button caramelButton;

    @FXML
    Button confirmOrderButton;

    @FXML
    Button restartOrderButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void basicCoffeeClick(ActionEvent e) throws IOException {
        order = new BasicCoffee();
        creamButton.setDisable(false);
        sugarButton.setDisable(false);
        xshotButton.setDisable(false);
        oreosButton.setDisable(false);
        caramelButton.setDisable(false);
        confirmOrderButton.setDisable(false);
        restartOrderButton.setDisable(false);
        orderText = orderText + "Black Coffee: $3.99\n";
    }

    public void creamButtonClick(ActionEvent e) throws IOException {
        order = new Cream(order);
        orderText = orderText + " + cream: $.50\n";
    }

    public void sugarButtonClick(ActionEvent e) throws IOException {
        order = new Sugar(order);
        orderText = orderText + " + sugar: $.50\n";
    }

    public void xshotButtonClick(ActionEvent e) throws IOException {
        order = new ExtraShot(order);
        orderText = orderText + " + extra shot: $1.20\n";
    }

    public void oreosButtonClick(ActionEvent e) throws IOException {
        order = new Oreos(order);
        orderText = orderText + " + crumbled oreos: $1.00\n";
    }

    public void caramelButtonClick(ActionEvent e) throws IOException {
        order = new Caramel(order);
        orderText = orderText + " + caramel: $0.50\n";
    }

    public void confirmButtonClick(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Myfxml2.fxml"));
        root.getStylesheets().add("/styles/style2.css");
        Stage window = (Stage) basicCoffeeButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 600));
    }

    public void restartButtonClick(ActionEvent e) throws IOException {
        Coffee order2 = new Coffee() {
            @Override
            public double makeCoffee() {
                return 0;
            }
        };
        order = order2;
        creamButton.setDisable(true);
        sugarButton.setDisable(true);
        xshotButton.setDisable(true);
        oreosButton.setDisable(true);
        caramelButton.setDisable(true);
        confirmOrderButton.setDisable(true);
        restartOrderButton.setDisable(true);
    }
}
