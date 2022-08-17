import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CartasController {

    @FXML
    private Tab abaCalcularPeso;

    public CompilaCartas compila_cartas;

    @FXML
    private Tab abaMostrarCartas;

    @FXML
    private TextField cartasSelecionadas;

    @FXML
    private Button buscarButton;

    @FXML
    private Button botaoAnterior;

    @FXML
    private Button botaoProxima;

    @FXML
    private TabPane pnCalcularPeso;

    @FXML
    private AnchorPane pnMostrarCartas;

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
    private TextField showAllWeightOfCards;

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

    private static ArrayList<Carta> cartas = CompilaCartas.getListaCartas();
    private int indice = -1;

    public void showCard(int indice, String dataEnvio, String remetente, String responsavel, String contato,
            String endereco, String item, float peso, float largura, float altura, String categoria) {
        txNCarta.setText(String.valueOf(indice + 1));
        txDataEnvio.setText(dataEnvio);
        txRemetente.setText(remetente);
        txResponsavel.setText(responsavel);
        txContato.setText(contato);
        txEndereco.setText(endereco);
        txItem.setText(item);
        txPeso.setText(String.valueOf(peso));
        txLargura.setText(String.valueOf(largura));
        txAltura.setText(String.valueOf(altura));
        txCategoria.setText(categoria);
    }

    @FXML
    void anteriorCarta(ActionEvent event) throws Exception {
        if (indice > 0) {
            botaoAnterior.setDisable(false);
            botaoProxima.setDisable(false);
            this.indice--;
            Carta c = cartas.get(this.indice);
            showCard(this.indice, c.getData_envio(), c.getDados().getNome_crianca(), c.getDados().getNome_res(),
                    c.getDados().getTelefone(),
                    c.getEndereco().getLogradouro() + " " + c.getEndereco().getNum_end() + " "
                            + c.getEndereco().getBairro() + " " + c.getEndereco().getCidade(),
                    c.getItem().getItem_pedido(), c.getItem().getPeso(), c.getItem().getLargura(),
                    c.getItem().getAltura(), c.getItem().getCateg());
        }
        
        else
            botaoAnterior.setDisable(true);
        

        System.out.println("Carta anterior.");
    }

    @FXML
    void proximaCarta(ActionEvent event) throws Exception {
        if (this.indice == -1)
            this.indice++;

        if (this.indice < cartas.size() - 1) {
            this.indice++;
            botaoProxima.setDisable(false);
            botaoAnterior.setDisable(false);
            Carta c = cartas.get(this.indice);
            showCard(this.indice, c.getData_envio(), c.getDados().getNome_crianca(), c.getDados().getNome_res(),
                    c.getDados().getTelefone(),
                    c.getEndereco().getLogradouro() + " " + c.getEndereco().getNum_end() + " "
                            + c.getEndereco().getBairro() + " " + c.getEndereco().getCidade(),
                    c.getItem().getItem_pedido(), c.getItem().getPeso(), c.getItem().getLargura(),
                    c.getItem().getAltura(), c.getItem().getCateg());
        }
        else 
            botaoProxima.setDisable(true);
        System.out.println("Proxima carta.");
    }

    @FXML
    void calcularCartas(ActionEvent event) {
        String cartasSelecionadasStr = cartasSelecionadas.getText();
        String[] cartasSelecionadasArray = cartasSelecionadasStr.split(",", 0);

        float pesoTotal = 0;

        for (String idCarta : cartasSelecionadasArray) {
            Carta c = cartas.get(Integer.parseInt(idCarta) - 1);
            pesoTotal += c.getItem().getPeso()/1000.00;
        }

        showAllWeightOfCards.setText(String.valueOf(pesoTotal));
    }

}
