package entidade;

import util.enumTipo;

public class Caderno extends Produto{
    enumTipo Tipo;
    int QuantidadeMaterias;

    public enumTipo getTipo() {
        return Tipo;
    }
    public void setTipo(enumTipo tipo) {
        Tipo = tipo;
    }
    
    public int getQuantidadeMaterias() {
        return QuantidadeMaterias;
    }
    public void setQuantidadeMaterias(int quantidadeMaterias) {
        QuantidadeMaterias = quantidadeMaterias;
    }
}
