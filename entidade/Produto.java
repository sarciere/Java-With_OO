package entidade;

public class Produto {
    
    private float Preco;
    private double Quantidade;

    public float getPreco() {
        return Preco;
    }
    public void setPreco(float preco) {
        Preco = preco;
    }
    
    public double getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    float CalcularFrete(){
        return 0;
    }
}
