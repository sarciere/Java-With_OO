package entidade;
public class Cliente {
    private String Nome;
    private int CPF;
        
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }
}
