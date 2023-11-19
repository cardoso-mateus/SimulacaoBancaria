import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "[INSIRA O NOME AQUI]";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;
        String tela = """
                ***********************
                Dados iniciais do cliente:
                                            
                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                ***********************
                """.formatted(nomeCliente, tipoConta, saldo);
        System.out.println(tela);
        String menu = """
                \nOperações
                                            
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                              
                Digite a opção desejada:
                """;
        Scanner input = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo + "\n");
                    break;
                case 2:
                    System.out.print("Valor a ser recebido: ");
                    double valorRecebido = input.nextDouble();
                    if (valorRecebido < 0) {
                        saldo = saldo;
                        System.out.println("Valor de recebimento inválido!");
                    } else {
                        saldo += valorRecebido;
                        System.out.println("Valor recebido!");
                    }
                    break;
                case 3:
                    System.out.print("Valor a ser transferido: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido < 0) {
                        saldo = saldo;
                        System.out.println("Valor de transferencia inválido!");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Valor transferido!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o serviço!");
                    break;
                default:
                    System.out.println("Opção inválida, tente uma das opções listadas no menu Operações!");
            }
        }
    }
}