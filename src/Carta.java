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