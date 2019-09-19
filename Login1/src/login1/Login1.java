/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Login1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Skd's Multiplyer");

        //Scene
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Enter Your Numbers!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label Number1 = new Label("Number1:");
        grid.add(Number1, 0, 1);

        TextField xTextField = new TextField();
        grid.add(xTextField, 1, 1);

        Label Number2 = new Label("Number2:");
        grid.add(Number2, 0, 2);

        /*TextField yTextField = new TextField();
        grid.add(yTextField, 1, 1);*/
        TextField yTextField = new TextField();
        grid.add(yTextField, 1, 2);


        Button btn = new Button("Compute");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.BLUE);
                int result;
                try {
                    String xText = xTextField.getText();
                    String yText = yTextField.getText();
                    int Number1 = Integer.parseInt(xText);
                    int Number2 = Integer.parseInt(yText);
                    result = Number1 * Number2;
                    //rslt.setText("x*y=" + result);
                } catch (java.lang.NumberFormatException nfe) {
                    //rslt.setText("x*y=" + 0);
                    result = 0;

                }

                actiontarget.setText("X*Y=" + result);
            }
        });
        primaryStage.show();
    }
    //StackPane root = new StackPane();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
