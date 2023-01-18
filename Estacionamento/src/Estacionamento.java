public class Estacionamento {
    private String nome;
    private Endereco endereco;
    private Float valorDaHora;
    private int NumVagas;
    
    public Estacionamento(String nome, Endereco endereco, Float valorDaHora, int NumVagas ) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorDaHora = valorDaHora;
        this.NumVagas = NumVagas;
    }

    public String getNome() {
        return this.nome;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }

    public Float getValorDaHora() {
        return this.valorDaHora;
    }

    public int getNumVagas(){
        return this.NumVagas;
    }
}
