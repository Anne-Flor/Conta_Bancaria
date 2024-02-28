import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args){
        System.out.println("""
                **************************
                DADOS INICIAIS DA CLIENTE:

                Nome: Jacqueline Oliveira
                Tipo de conta: Corrente
                Saldo inicial: R$2200,00.
                **************************
                """);

        String menu = """
                
        Operações

        1- Consultar Saldo
        2- Depositar Valor
        3- Transferir Valor
        4- Sair
                """;
                
        Scanner scanner = new Scanner(System.in);
        int operacoes = 0;
        double saldo = 2200.0;
        double deposita = 0;
        double valorTransferencia = 0;

        while (operacoes != 4) {
            System.out.println(menu);
            operacoes = scanner.nextInt();
            
            if (operacoes == 1) {
                System.out.println(saldo);

            }else if (operacoes == 2) {
                
                System.out.println("Digite o valor que deseja depositar: ");
                deposita = scanner.nextDouble();
                saldo += deposita; 
                System.out.println("Dinheiro depositado, seu novo saldo é R$" + saldo);

            }else if (operacoes == 3) {
                
                System.out.println("Digite o valor que deseja transferir");
                valorTransferencia = scanner.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Não é possível realizar a transferencia, saldo insuficiente, seu saldo atual é R$" + saldo);
                } else{
                    saldo -= valorTransferencia; 
                    System.out.println("Transferencia realizada no valor de R$" + valorTransferencia + "Seu novo saldo é R$" + saldo);
                }
            }
        }
    }
}