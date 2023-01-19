public class Estacionamento {
    private String nome;
    private Endereco endereco;
    private int qtVagas;
    private double valorHora;
  
    public Estacionamento(String nome, Endereco endereco, int qtVagas, double valorHora) {
      this.nome = nome;
      this.endereco = endereco;
      this.qtVagas = qtVagas;
      this.valorHora = valorHora;
    }
  
    public String getNome() {
      return nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public Endereco getEndereco() {
      return endereco;
    }
  
    public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
    }
  
    public int getQtVagas() {
      return qtVagas;
    }
  
    public void setQtVagas(int qtVagas) {
      this.qtVagas = qtVagas;
    }
  
    public double getValorHora() {
      return valorHora;
    }
  
    public void setValorHora(double valorHora) {
      this.valorHora = valorHora;
    }
  
    public int removeVagas() {
      return this.qtVagas = this.qtVagas - 1;
    }
  
    public int adicionaVagas() {
        return this.qtVagas = this.qtVagas + 1;
    }
  
    @Override
    public String toString() {
      return  "[" +
              "nome = " + nome + ", " + 
              "endereco = " + endereco + ", " +
              "qtVagas = " + qtVagas + ", " +
              "valorHora = " + valorHora +
              "]";
    }
  }
  