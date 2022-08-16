public class Item {
    private String item_pedido, categ;
    private float peso,altura,largura,dimensao;

    public String getItem_pedido() {
        return item_pedido;
    }

    public void setItem_pedido(String item_pedido) {
        this.item_pedido = item_pedido;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getDimensao() {
        return dimensao;
    }

    public void setDimensao(float altura, float largura) {
        this.dimensao = altura*largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    

        
    
}
