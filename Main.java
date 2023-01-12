import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws Exception {

    // Declaração de Objetos
    Scanner scanner = new Scanner(System.in);

    // Declração de Variáveis
    int opc, opc2, numero;
    double valorDaHora = 5.0;
    String nome, logradouro, bairro, cidade, uf;
    ArrayList<String> placas = new ArrayList();

    // Menu de opções do sistema
    while (true) {

      System.out.println("\n\t O que deseja?");

      System.out.println("\n\t1 - Cadastro\n\t2 - Reservar vaga\n\t3 - Retirar o veículo");

      System.out.println("\n");

      System.out.println("Informe sua opção: ");
      opc = scanner.nextInt();

      while (opc < 1 || opc > 3) {

        System.out.println("\nOpação Inválida!\n");

        System.out.println("\n\t O que deseja?");

        System.out.println("\n\t1 - Cadastro \n\t2 - Sair Do Sistema");

        System.out.println("Informe sua opção: ");
        opc = scanner.nextInt();
      }

      // Cadastrar o cliente no sistema do estacionamento
      if (opc == 1) {

        System.out.println("\n Dados Pessoais \n");

        System.out.println("Nome:");
        nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println("\n Seu Endereço Completo \n");

        System.out.println("Rua:");
        logradouro = scanner.nextLine();

        System.out.println("Número:");
        numero = scanner.nextInt();

        System.out.println("Bairro:");
        bairro = scanner.nextLine();
        bairro = scanner.nextLine();

        System.out.println("Cidade:");
        cidade = scanner.nextLine();

        System.out.println("UF:");
        uf = scanner.nextLine();

        System.out.println("\n Dados do veículo \n");

        System.out.println("Placa:");
        placa = scanner.nextLine();

      }
      // Reservar vaga para o veículo
      if (opc == 2) {

        System.out.println("Valor da hora: " + valorDaHora);

        System.out.println("Placa do veículo:");

        System.out.println("Data da entrada:");

        System.out.println("Horário da entrada:");

      }
      // Retirar o veículo da vaga e fazer a cobrança
      if (opc == 3) {
        System.out.println("\n Retirar o veículo \n");

        System.out.println("Placa do veículo estacionado:");

        System.out.println("Data da saída:");

        System.out.println("Horário da saída: ");

        System.out.println("\n Recibo \n");

        System.out.println("Placa do veículo:");
        System.out.println("Quantidade de horas estacionados:");
        System.out.println("Valor a ser pago: ");
      }

    }

  }
}
