import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CartasController {

    int i=30;
    @FXML
    private Tab abaCalcularPeso;

    @FXML
    private Tab abaMostrarCartas;

    @FXML
    private Button botaoAnterior;

    @FXML
    private Button botaoProxima;

    @FXML
    private TabPane pnCalcularPeso;

    @FXML
    private AnchorPane pnMostrarCartas;

    @FXML
    private CheckBox rdSelecionarCarta;

    @FXML
    private Label rotuloAltura;

    @FXML
    private Label rotuloCategoria;

    @FXML
    private Label rotuloContato;

    @FXML
    private Label rotuloDataEnvio;

    @FXML
    private Label rotuloEndereco;

    @FXML
    private Label rotuloItem;

    @FXML
    private Label rotuloLargura;

    @FXML
    private Label rotuloNCarta;

    @FXML
    private Label rotuloPeso;

    @FXML
    private Label rotuloRemetente;

    @FXML
    private Label rotuloResponsavel;

    @FXML
    private Label rotuloTitulo;

    @FXML
    private TextField txAltura;

    @FXML
    private TextField txCategoria;

    @FXML
    private TextField txContato;

    @FXML
    private TextField txDataEnvio;

    @FXML
    private TextField txEndereco;

    @FXML
    private TextField txItem;

    @FXML
    private TextField txLargura;

    @FXML
    private TextField txNCarta;

    @FXML
    private TextField txPeso;

    @FXML
    private TextField txRemetente;

    @FXML
    private TextField txResponsavel;

    @FXML
    void actionTxNCarta(ActionEvent event) {
    }

    @FXML
    void anteriorCarta(ActionEvent event) {

    }

    @FXML
    void proximaCarta(ActionEvent event) {
        txNCarta.setText("" + i); //exemplo de como colocar valor de uma variável em uma caixa de texto
    }

    @FXML
    void selecionarCarta(ActionEvent event) {

    }

}
