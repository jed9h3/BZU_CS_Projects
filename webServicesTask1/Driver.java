package webServicesTask1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Driver extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("XML search using ID");
        BorderPane root = new BorderPane();
        VBox bigContainer = new VBox(10);
        root.setCenter(bigContainer);
        Scene scene1 = new Scene(root, 500, 500);
        primaryStage.setScene(scene1);
        VBox titleContainer = new VBox(50);
        Label titleL = new Label("Search for a student using their ID");
        TextField idTf = new TextField();
        titleContainer.getChildren().addAll(titleL, idTf);
        VBox nameContainer = new VBox(5);
        Label nameL = new Label("Name");
        TextField nameTf = new TextField();
        nameContainer.getChildren().addAll(nameL, nameTf);
        VBox dateContainer = new VBox(5);
        Label dateL = new Label("Date of birth");
        TextField dateTf = new TextField();
        dateContainer.getChildren().addAll(dateL, dateTf);
        VBox avgContainer = new VBox(5);
        Label avgL = new Label("Current semester average");
        TextField avgTf = new TextField();
        avgContainer.getChildren().addAll(avgL, avgTf);
        bigContainer.getChildren().addAll(titleContainer, nameContainer, dateContainer, avgContainer);
        // ============================================================================================
        titleContainer.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #151515");
        titleL.setTextFill(Color.WHITE);
        nameL.setTextFill(Color.WHITE);
        dateL.setTextFill(Color.WHITE);
        avgL.setTextFill(Color.WHITE);
        titleL.setFont(new Font("Arial", 25));
        nameL.setFont(new Font("Arial", 17));
        dateL.setFont(new Font("Arial", 17));
        avgL.setFont(new Font("Arial", 17));

        idTf.setMaxHeight(40);
        idTf.setMinHeight(40);
        idTf.setFont(Font.font("Verdana", FontWeight.MEDIUM, 16));
        idTf.setStyle("-fx-text-fill: white; -fx-background-color: #202020;");

        nameTf.setMaxHeight(40);
        nameTf.setMinHeight(40);
        nameTf.setFont(Font.font("Verdana", FontWeight.MEDIUM, 16));
        nameTf.setStyle("-fx-text-fill: white; -fx-background-color: #202020;");

        dateTf.setMaxHeight(40);
        dateTf.setMinHeight(40);
        dateTf.setFont(Font.font("Verdana", FontWeight.MEDIUM, 16));
        dateTf.setStyle("-fx-text-fill: white; -fx-background-color: #202020;");

        avgTf.setMaxHeight(40);
        avgTf.setMinHeight(40);
        avgTf.setFont(Font.font("Verdana", FontWeight.MEDIUM, 16));
        avgTf.setStyle("-fx-text-fill: white; -fx-background-color: #202020;");

        nameTf.setEditable(false);
        dateTf.setEditable(false);
        avgTf.setEditable(false);

        titleContainer.setPadding(new Insets(50, 30, 0, 30));
        nameContainer.setPadding(new Insets(30, 30, 0, 30));
        dateContainer.setPadding(new Insets(10, 30, 0, 30));
        avgContainer.setPadding(new Insets(10, 30, 0, 30));

        primaryStage.show();
        // ============================================================================================
        idTf.textProperty().addListener(act -> {
            try {
                if (!idTf.getText().isEmpty())
                    Integer.parseInt(idTf.getText());
            } catch (Exception e) {
                idTf.setStyle(
                        "-fx-text-fill: white; -fx-background-color: #202020; -fx-border-radius: 3; -fx-border-color:  rgba(244, 00, 00, 0.5); -fx-border-width: 1;");
                idTf.setText(idTf.getText().substring(0, idTf.getText().length() - 1));
                Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500),
                        ae -> idTf.setStyle("-fx-text-fill: white; -fx-background-color: #202020;")));
                timeline.play();
            }
        });
    }
}