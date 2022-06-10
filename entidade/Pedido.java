package entidade;

public class Pedido {
    int Codigo;
    Double Total;
    Produto Produtos[];
    Cupom cupom;
    Cliente cliente; 

    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
            
    public Double getTotal() {
        return Total;
    }
    public void setTotal(Double total) {
        Total = total;
    }
        
    public Produto[] getProdutos() {
        return Produtos;
    }
    public void setProdutos(Produto[] produtos) {
        Produtos = produtos;
    }
    
    public Cupom getCupom() {
        return cupom;
    }
    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }
       
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
