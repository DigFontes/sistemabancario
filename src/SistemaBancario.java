import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        String nome = "Alan Harper";
        String tipoConta = "Corrente";
        double saldo = 900.00;
        int opcao = 0;
        String menu = """
                \n
                ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
                ¨¨ Digite sua opção ¨¨
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
                \n""";
        Scanner leitor = new Scanner(System.in);

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo atual: " + saldo);

            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja tranferir?");
                double valorTransferencia = leitor.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println(
                            "\nO saldo em conta não é suficiente para realizar a transferência!\nSeu saldo atual é de: " + saldo
                    );
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Seu saldo atualizado é de: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor a receber: ");
                double valorRecebido = leitor.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo atualizado é de: " + saldo);
            } else if (opcao != 4) {
                System.out.println(
                        "Opção inválida! Você digitou: " + opcao + "\nSelecione uma das opções do menu!"
                );
            }

        }

    }

}