import java.lang.String;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        String nome = "clara";
        String tipoConta = "Corrente";
        double saldo =  1599.99;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opção **
                1- Concultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair

                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atualizado é " + saldo + "\n");
            } else if (opcao == 2 ){
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.\n");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo + "\n");
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo + "\n");
            } else {
                System.out.println("Opção inválida.\n");
            }
        }
    }
}

 