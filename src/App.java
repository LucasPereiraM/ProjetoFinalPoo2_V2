import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
        CompilaCartas compila_cartas = new CompilaCartas();
        compila_cartas.mostraCartas();
        compila_cartas.calculaAreaCartas();
        compila_cartas.CalculaAreaEspecifica(3);
        

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interfaceGrafica.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Cartas Papai Noel");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}