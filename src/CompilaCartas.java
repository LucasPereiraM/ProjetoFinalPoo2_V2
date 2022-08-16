import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompilaCartas extends Carta{

    ArrayList<Carta> lista_cartas = new ArrayList<>();
   
    public CompilaCartas() throws IOException {
        
        try {
            
            int count_arquivos=0;
            File arqs = new File("src/cartas");
            count_arquivos = arqs.listFiles().length;
            
            //a partir daqui o for percorre todos os arquivos da coleçao.
            //percorrendo os arquivos, ele busca o ": " (que delimita o inicio do valor que procuramos)
            //quando encontra, seta o valor nos atributos
            //isso acontece ate o fim do arquivo
            
            for(int i=1;i<=count_arquivos;i++){
                
                DadosPessoais dados = new DadosPessoais();
                Endereco endereco = new Endereco();
                Item item = new Item();
                String data;
                Scanner scanner = new Scanner(new File("src/Cartas/"+i+".txt"));
                
                String linha = scanner.nextLine();
                String[] partes = linha.split(": ");
                data = partes[1].toString();
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                dados.setNome_crianca(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                endereco.setLogradouro(partes[1]);
               
                linha = scanner.nextLine();
                partes =  linha.split(": ");
                int num = Integer.parseInt(partes[1]);
                endereco.setNum_end(num);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                endereco.setBairro(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                endereco.setCidade(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                dados.setTelefone(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                dados.setNome_res(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                item.setItem_pedido(partes[1]);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                float peso = Float.parseFloat(partes[1]);
                item.setPeso(peso);
                
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                float altura = Float.parseFloat(partes[1]);
                item.setAltura(altura);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                float largura = Float.parseFloat(partes[1]);
                item.setLargura(largura);
                
                item.setDimensao(altura, largura);
                
                linha = scanner.nextLine();
                partes = linha.split(": ");
                item.setCateg(partes[1]);
                
                scanner.close();
                
                Carta carta = new Carta(); //cria uma nova carta
                carta.geraCarta(dados, endereco, item, data); //usa o "builder" da carta para unificar as classes
                lista_cartas.add(carta); //insere a carta numa lista de classes
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void mostraCartas(){
        int i=1;
        for(Carta n : lista_cartas){ //percorre toda lista de classes
            System.out.println("Carta: "+i); //mostra o numero da carta
            n.getCarta(); //mostra a carta
            i++; //incrementa o número da carta a ser mostrao
            System.out.println("-------------------------");
        }
    }
        
    public void calculaAreaCartas(){
        int i=1;
        float area;
        for(Carta n : lista_cartas){ //percorre a lista de carta
            area = n.calculaArea(); //calcula as áreas (volume) de toda a lista
            System.out.println("Área carta "+i+": "+area);
            i++;
        }
        System.out.println("-------------------------");
    }
    
    public void CalculaAreaEspecifica(int j){ //recebe o código da carta para calculo
        int i=0;
        int aux_j; //só pra facilitar a saída, para nao considerar a carta "0"
        float area;
        for(Carta n : lista_cartas){
            if(i==j){ //procura a carta pelo código
                area = n.calculaArea(); //calcula a area
                aux_j = j+1; //incrementa o auxiliar pra visualização
                System.out.println("Área carta "+aux_j+": "+area);
            }
            i++;
        }
    }
    
    //Ordenar os objetos por peso
    public void OrdenarCartasPeso(){
        System.out.println("Em construção");
    }
    
    //Ordenar os objetos por peso
    public void OrdenarCartasVolume(){
        System.out.println("Em construção");
    }
}