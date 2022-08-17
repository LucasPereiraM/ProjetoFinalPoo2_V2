public class Carta {
    String data_envio;
    DadosPessoais dados = new DadosPessoais();
    Endereco endereco = new Endereco();
    Item item = new Item();

    public void geraCarta(DadosPessoais d, Endereco e, Item i, String data) {
        this.data_envio = data;
        this.dados = d;
        this.endereco = e;
        this.item = i;
    }

    public void getCarta() {

        System.out.println("Data de envio:" + getData_envio());

        System.out.println("Remetente: " + getDados().getNome_crianca());
        System.out.println("Responsável: " + getDados().getNome_res());
        System.out.println("Contato: " + getDados().getTelefone());

        System.out.print("Endereço: " + getEndereco().getLogradouro() + ", ");
        System.out.print(getEndereco().getNum_end() + ", ");
        System.out.print(getEndereco().getBairro() + ", ");
        System.out.print(getEndereco().getCidade() + ".");

        System.out.println("Item: " + getItem().getItem_pedido());
        System.out.println("Peso: " + getItem().getPeso() + "g");
        System.out.println("Tamanho: " + getItem().getLargura() + "cm");
        System.out.println("Tamanho: " + getItem().getAltura() + "cm");
        System.out.println("Largura: " + getItem().getLargura() + "cm");
        System.out.println("Altura: " + getItem().getAltura() + "cm");
        System.out.println("Categoria: " + getItem().getCateg());

    }

    public float calculaArea() {
        return getItem().getDimensao();
    }

    public String getData_envio() {
        return data_envio;
    }

    public void setData_envio(String data_envio) {
        this.data_envio = data_envio;
    }

    public DadosPessoais getDados() {
        return dados;
    }

    public void setDados(DadosPessoais dados) {
        this.dados = dados;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}