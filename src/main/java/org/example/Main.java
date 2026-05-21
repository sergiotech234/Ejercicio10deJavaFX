package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Etiqueta inicial con mensaje
        Label label = new Label("Selecciona una opción");

        // Creación de una lista desplegable (ComboBox)
        // que almacenará texto (String)
        ComboBox<String> lista = new ComboBox<>();

        // Añadir elementos a la lista desplegable
        lista.getItems().addAll(
                "Java",
                "Python",
                "C++",
                "JavaScript"
        );

        // Creación del botón
        Button button1 = new Button("Mostrar");

        // Evento que ocurre al pulsar el botón
        button1.setOnAction(e -> {

            // Obtiene el elemento seleccionado
            // y lo muestra en el Label
            label.setText(lista.getValue());
        });

        // VBox organiza los elementos verticalmente
        // Orden: Label → ComboBox → Botón
        VBox layout = new VBox(label, lista, button1);

        // Creación de la escena
        Scene scene = new Scene(layout, 400, 300);

        // Título de la ventana
        primaryStage.setTitle("Ejercicio 10");

        // Se asigna la escena a la ventana principal
        primaryStage.setScene(scene);

        // Mostrar ventana
        primaryStage.show();
    }

    // Método principal que inicia la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
