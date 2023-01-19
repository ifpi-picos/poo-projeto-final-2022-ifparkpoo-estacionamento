import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;

public class Main {
  public static void main(String[] args) throws Exception {

    // Declaração de Objetos
    Scanner scanner = new Scanner(System.in);
    List<Estacionamento> estacionamentos = new ArrayList<>();
    List<Entrada> entradas = new ArrayList<>();
    List<Saida> saidas = new ArrayList<>();
    
    // Declração de Variáveis
    int opc, opc2 = 1, opc3, opc4, numero, vagas, contVagas = 0;
    double valorHora, valorTotal;
    boolean encerrar = true;
    String nome, rua, bairro, cidade, uf, placa;
    String dataEntradaString, horaEntradaString, dataSaidaString, horaSaidaString;
    LocalDateTime dataHoraEntrada, dataHoraSaida;
    Duration duration;
    Long qtHoras;

    // Menu de opções do sistema
    while (encerrar == true) {

      System.out.println("\n\t O que deseja?");

      System.out.println("\n\t[1] - Adicionar Estacionamento\n\t[2] - Remover Estacionamento\n\t[3] - Listar Estacionamentos\n\t[4] - Alterar informações de um estacionamento\n\t[5] - Adicionar veículo\n\t[6] - Remover veículo\n\t[7] - Sair\n\n");

      System.out.print("Informe sua opção: ");
      opc = scanner.nextInt();

      while (opc < 1 || opc > 7) {

        System.out.println("\nOpção Inválida!\n");

        System.out.println("\n\t O que deseja?");

        System.out.println("\n\t[1] - Adicionar Estacionamento\n\t[2] - Remover Estacionamento\n\t[3] - Listar Estacionamentos\n\t[4] - Alterar informações de um estacionamento\n\t[5] - Adicionar veículo\n\t[6] - Retirar  veículo de um estacionamento\n\t[7] - Sair\n\n");

        System.out.print("Informe sua opção: ");
        opc = scanner.nextInt();

        System.out.println();
      }

    switch(opc) {
      case 1:

        while (opc2 == 1) {
  
          System.out.println("\nInformações do Estacionamento \n");
          
          System.out.print("Nome do Estacionamento: ");
          nome = scanner.nextLine();
          nome = scanner.nextLine();
  
          System.out.print("Valor da hora: ");
          valorHora = scanner.nextDouble();
  
          System.out.print("Quantidade de vagas do Estacionamento: ");
          vagas = scanner.nextInt();
  
          System.out.print("Rua do Estacionamento: ");
          rua = scanner.nextLine();
          rua = scanner.nextLine();
  
          System.out.print("Número do Endereço: ");
          numero = scanner.nextInt();
  
          System.out.print("Bairro do Estacionamento: ");
          bairro = scanner.nextLine();
          bairro = scanner.nextLine();
  
          System.out.print("Cidade do Estacionamento: ");
          cidade = scanner.nextLine();
  
          System.out.print("UF do Estacionamento: ");
          uf = scanner.next();
          
          Estacionamento nvEstacionamento = new Estacionamento(nome, new Endereco(rua, numero, bairro, cidade, uf), vagas, valorHora);
          estacionamentos.add(nvEstacionamento);       
  
          System.out.println();
  
          System.out.println("Cadastrar mais um estacionamento?");
  
          System.out.println("\n\n\t1 - SIM \n\t2 - NÃO\n\n");
  
          System.out.print("Sua Resposta: ");
          opc2 = scanner.nextInt();

          System.out.println();
        }

        opc2 = 1;
        System.out.println();
        break;

      case 2:
        
        System.out.print("Digite o nome do estacionamento que deseja remover: ");
        nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println();
        
        for (int i = 0; i < estacionamentos.size(); i++) {
          if (nome.equals(estacionamentos.get(i).getNome())) {
            estacionamentos.remove(i);
            break;
          }
        }

        break;
        
      case 3:
        
        if(estacionamentos.size() == 0){
          System.out.println("\nNão existem estacionamentos cadastrados atualmente!");
          break;
        }
        System.out.println();
        
        for (int i = 0;i < estacionamentos.size(); i++){
          System.out.println(estacionamentos.get(i).toString());
        }

        System.out.println();
        break;

      case 4:

        System.out.println("Digite o nome do estacionamento que deseja alterar informações: ");
        nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println();
        
        for (int i = 0; i < estacionamentos.size(); i++) {
          if (nome.equals(estacionamentos.get(i).getNome())) {
            System.out.println("O que deseja alterar?");
            
            System.out.println("\n\n\t[1] - Nome do estacionamento\n\t[2] - Valor da hora\n\t[3] - Quantidade de vagas do estacionamento\n\t[4] - Endereço\n\n");

            System.out.print("Sua opção: ");
            opc3 = scanner.nextInt();

            System.out.println();

            if (opc3 == 1) {
              System.out.print("Digite o novo nome do estacionamento: ");
              nome = scanner.nextLine();
              nome = scanner.nextLine();
             
              estacionamentos.get(i).setNome(nome);
            }

            else if (opc3 == 2) {
              System.out.print("Digite o novo Valor da Hora: ");
              valorHora = scanner.nextDouble();
              
              estacionamentos.get(i).setValorHora(valorHora);
            }

            else if (opc3 == 3) {
              System.out.print("Digite a nova Quantidade de Vagas: ");
              vagas = scanner.nextInt();

              estacionamentos.get(i).setQtVagas(vagas);
            }

            else if (opc3 == 4) {
              System.out.println("Escolha o a informação que deseja alterar");
              
              System.out.println("\n\n\t[1] - Rua\n\t[2] - Número\n\t[3] - Bairro\n\t[4] - Cidade\n\t[5] - Estado (UF)\n\n");

              System.out.print("Sua opção: ");
              opc4 = scanner.nextInt();

              System.out.println();

              if (opc4 == 1) {
                System.out.print("Digite o novo nome da rua: ");
                rua = scanner.nextLine();
                rua = scanner.nextLine();

                estacionamentos.get(i).getEndereco().setRua(rua);
              }

              else if (opc4 == 2) {
                System.out.print("Digite o novo número do estacionamento: ");
                numero = scanner.nextInt();
                estacionamentos.get(i).getEndereco().setNumero(numero);
              }
            
              else if (opc4 == 3) {
                System.out.print("Digite o novo nome do bairro: ");
                bairro = scanner.nextLine();
                bairro = scanner.nextLine();

                estacionamentos.get(i).getEndereco().setBairro(bairro);
              }

              else if (opc4 == 4) {
                System.out.print("Digite o novo nome da Cidade: ");
                cidade = scanner.nextLine();
                cidade = scanner.nextLine();

                estacionamentos.get(i).getEndereco().setCidade(cidade);
              }

              else if (opc4 == 5) {
                System.out.print("Digite o novo nome do Estado (UF): ");
                uf = scanner.nextLine();
                uf = scanner.nextLine();

                estacionamentos.get(i).getEndereco().setUf(uf);
              }            
            }
           
            break;
          }
        }

       break;
        
      case 5:
        System.out.print("Digite o nome do estacionamento que deseja estacionar: ");
        nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println();

        for (int i = 0; i < estacionamentos.size(); i ++) {
          if (nome.equals(estacionamentos.get(i).getNome())) {
            if (estacionamentos.get(i).getQtVagas() != 0) {
              System.out.print("Placa do Veículo: ");
              placa = scanner.next();

              System.out.println();

              System.out.print("Data de Entrada (DD/MM/AAAA): ");
              dataEntradaString = scanner.next();

              String[] dtVetorEntradaString = dataEntradaString.split("/");

              Integer[] dtVetorEntradaInteger = {Integer.parseInt(dtVetorEntradaString[2]), Integer.parseInt(dtVetorEntradaString[1]), Integer.parseInt(dtVetorEntradaString[0])};

              System.out.print("Horário da Entrada (HH:MM): ");
              horaEntradaString = scanner.next();

              String[] hrVetorEntrada = horaEntradaString.split(":");

              Integer[] hrVetorEntradaInteger = {Integer.parseInt(hrVetorEntrada[0]), Integer.parseInt(hrVetorEntrada[1])};

              dataHoraEntrada = LocalDateTime.of(dtVetorEntradaInteger[0], dtVetorEntradaInteger[1], dtVetorEntradaInteger[2], hrVetorEntradaInteger[0], hrVetorEntradaInteger[1]);

              Entrada entrada = new Entrada(placa, dataHoraEntrada, estacionamentos.get(i));

              entradas.add(entrada);

              estacionamentos.get(i).removeVagas();              
            }

            else {
              System.out.println("\nNão Há vagas nesse estacionamento!\n");
            }
          }
        }

        //System.out.println(entradas);

        break;
        
      case 6:
        System.out.print("Digite o nome do estacionamento que deseja retirar o veículo: ");
        nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println();

        for (int i = 0; i < entradas.size(); i ++) {
          if (nome.equals(entradas.get(i).getEstacionamento().getNome())) {
            System.out.print("Placa do Veículo: ");
            placa = scanner.next();

            System.out.println();
            
            if (placa.equals(entradas.get(i).getPlaca())) {

              System.out.print("Data da Saída (DD/MM/AAAA): ");
              dataSaidaString = scanner.next();

              String[] dtVetorSaidaString = dataSaidaString.split("/");

              Integer[] dtVetorSaidaInteger = {Integer.parseInt(dtVetorSaidaString[2]), Integer.parseInt(dtVetorSaidaString[1]), Integer.parseInt(dtVetorSaidaString[0])};

              System.out.print("Horário da Saída (HH:MM): ");
              horaSaidaString = scanner.next();

              String[] hrVetorSaidaString = horaSaidaString.split(":");

              Integer[] hrVetorSaidaInteger = {Integer.parseInt(hrVetorSaidaString[0]), Integer.parseInt(hrVetorSaidaString[1])};


              dataHoraSaida = LocalDateTime.of(dtVetorSaidaInteger[0], dtVetorSaidaInteger[1], dtVetorSaidaInteger[2], hrVetorSaidaInteger[0], hrVetorSaidaInteger[1]);
              
              duration = Duration.between(entradas.get(i).getDataHora(), dataHoraSaida);
                
              qtHoras = duration.toHours();
  
              valorTotal = entradas.get(i).getEstacionamento().getValorHora() * qtHoras;
              
              Saida saida = new Saida(dataHoraSaida, placa, qtHoras, valorTotal, entradas.get(i).getEstacionamento());

              saidas.add(saida);

              System.out.println();
              System.out.println(saidas);
              System.out.println();

              for (int j = 0; j < estacionamentos.size(); j++) {
                if (entradas.get(i).getEstacionamento().getNome().equals(estacionamentos.get(i).getNome())) {
                  entradas.remove(entradas.get(i));
                  estacionamentos.get(i).adicionaVagas();
                  break;
                }
              }
            }

            else {
              System.out.println("\nPlaca não encontrada nesse estacionamento!\n");
            }
          }
        }

        break;     

      case 7:
        System.out.print("Sistema Encerrado!\n");
        encerrar = false;
        break;     
      }
    }
  }
}
