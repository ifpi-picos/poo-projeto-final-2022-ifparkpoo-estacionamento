import java.time.LocalDateTime;

public class Saida {
  private LocalDateTime dataHora;
  private String placa;
  private long qtHoras;
  private double valorTotal;
  private Estacionamento estacionamento;

  public Saida(LocalDateTime dataHora, String placa, long qtHoras, double valorTotal, Estacionamento estacionamento) {
    this.dataHora = dataHora;
    this.placa = placa;
    this.qtHoras = qtHoras;
    this.valorTotal = valorTotal;
    this.estacionamento = estacionamento;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public long getQtHoras() {
    return qtHoras;
  }

  public void setQtHoras(long qtHoras) {
    this.qtHoras = qtHoras;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Estacionamento getEstacionamento() {
    return estacionamento;
  }

  public void setEstacionamento(Estacionamento estacionamento) {
    this.estacionamento = estacionamento;
  }

  @Override
  public String toString() {
    return "[" + 
           "dataHora = " + dataHora + ", " +
           "placa = " + placa + ", " +
           "qtHoras = " + qtHoras + ", " +
           "valorTotal = " + valorTotal + ", " +
           "estacionamento = " + estacionamento
           + "]";
  }
}
