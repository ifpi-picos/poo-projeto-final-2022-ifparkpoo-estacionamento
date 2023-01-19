import java.time.LocalDateTime;

public class Entrada {
  private String placa;
  private LocalDateTime dataHora;
  private Estacionamento estacionamento;

  public Entrada(String placa, LocalDateTime dataHora, Estacionamento estacionamento) {
    this.placa = placa;
    this.dataHora = dataHora;
    this.estacionamento = estacionamento;
  }

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
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
              "placa = " + placa + ", " +
              "dataHora = " + dataHora + ", " +
              "estacionamento = " + estacionamento
            + "]";
  }
}
