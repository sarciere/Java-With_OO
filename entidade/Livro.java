package entidade;

import util.enumGenero;

public class Livro extends Produto{
    enumGenero Genero;
    String Nome;

    public enumGenero getGenero() {
        return Genero;
    }
    public void setGenero(enumGenero genero) {
        Genero = genero;
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
}
