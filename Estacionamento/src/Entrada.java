public class Entrada {
    
    private String placa;
    private String dataHoraEntrada;
    private String dataHoraSaida;
    private double quantHoras;


    public Entrada(String placa, String dataHoraEntrada, String dataHoraSaida, double quantHoras) {
        this.placa = placa;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.quantHoras = quantHoras;
    
    }


    public String getPlaca() {
        return placa;
    }


    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }


    public String getDataHoraSaida() {
        return dataHoraSaida;
    }


    public double getQuantHoras() {
        return quantHoras;
    }


}