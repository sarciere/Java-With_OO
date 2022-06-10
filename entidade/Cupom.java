package entidade;

public class Cupom {
    int Codigo;
    float PercentualDesconto;
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    
    public float getPercentualDesconto() {
        return PercentualDesconto;
    }
    public void setPercentualDesconto(float percentualDesconto) {
        PercentualDesconto = percentualDesconto;
    }    
}
