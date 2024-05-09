// Projeto integrador: Derick Bueno Silva, Izabela Pereira Andrade Cruz e Ryan da Silva - TURMA E

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== MENU DE OPÇÕES ======");
        System.out.println("1 - Cadastrar Vagas");
        System.out.println("2 - Mostrar Vagas");
        System.out.println("3 - Cadastro de Condutores");
        System.out.println("4 - Cadastro de veículos");
        System.out.println("5 - Escala de horários");
        System.out.println("6 - Lista negra de condutores");
        System.out.println("7 - Estacionar veículo");
        System.out.println("8 - Retirar veículo");
        System.out.println("0 - Sair");

        Scanner entrada = new Scanner(System.in);

        int opcaoMenu = entrada.nextInt();

        switch (opcaoMenu) {
        case 1:
        System.out.println("Digite a CNH do condutor: ");
        int cnh = entrada.nextInt();
        System.out.println("Digite a placa do veículo: ");
        String placa = entrada.next();
        break;
       case 2:
       System.out.println("Digite o piso desejado (terreo ou superior): ");
       String piso = entrada.next();
       switch (piso) {
       case "terreo":
       System.out.println("Total de vagas disponíveis no térreo: 250");
       break;
       case "superior":
       System.out.println("Total de vagas disponíveis no superior: 155");
       break;
       default:
       System.out.println("Piso não reconhecido.");
                }
      break;
      case 3:
     System.out.println("Digite o nome do condutor:");
     String nomeCondutor = entrada.next();
     System.out.println("Digite o cpf do condutor:");
     String cpfCondutor = entrada.next();
     System.out.println("Digite o cep e número do condutor:");
     String cepNumero = entrada.next();
          System.out.println("O veículo possui mais de um condutor? Se sim, digite o nome: ");
        String nomeCondutor2 = entrada.next();
       break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        entrada.close();
    }
}
