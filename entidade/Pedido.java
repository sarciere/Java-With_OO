package entidade;

public class Pedido {
    private int Codigo;
    private Double Total;
    private List<Produto> Produtos;
    private Cupom cupom;
    private Cliente cliente; 

    public Pedido(){
        this.Produtos = new ArrayList<>();
    }

    public int getCodigo() { return Codigo; }
    public Double getTotal() { return Total; }
    public Cupom getCupom() { return cupom; }
    public Cliente getCliente() { return cliente; }
            
    public void setCodigo(int codigo) { Codigo = codigo; }
    public void setTotal(Double total) { Total = total; }
    public void setCupom(Cupom cupom) { this.cupom = cupom; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    
}
