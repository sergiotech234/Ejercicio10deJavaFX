package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Selecciona una opción");

        ComboBox<String> lista = new ComboBox<>();

        lista.getItems().addAll(
                "Java",
                "Python",
                "C++",
                "JavaScript"
        );

        Button button1 = new Button("Mostrar");

        button1.setOnAction(e -> {
            label.setText(lista.getValue());
        });

        VBox layout = new VBox(label, lista, button1);

        Scene scene = new Scene(layout, 400, 300);

        primaryStage.setTitle("Ejercicio 10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}