import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


/**
**  <p>A classe ContaTerminal faz interação entre o usuário e o sistema, 
*   permitindo a coleta de dados para criação da conta via terminal.</p>
*
*   @author Patrick
*   @version 1.0
*   @since 03/12/2025
*   @throws InputMismatchException pode gerar erro de tipo nos parâmetros número e saldo do objeto conta.
*/


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();

        System.out.println("-- Bem vindo ao sistema de criação de conta bancária -- \nPreencha os dados abaixo para realizar o seu cadastro!\n");

        try{
        
            System.out.print("Digite o número da conta: ");
            conta.numero = sc.nextInt();

            System.out.print("Digite o número da agência: ");
            conta.agencia = sc.next();

            sc.nextLine(); //Para o buffer não ficar com o \n e pular linha vázio.

            while(true){
                System.out.print("Digite o nome do titular da conta: ");
                conta.nomeCliente = sc.nextLine().trim();

                if (conta.nomeCliente.isBlank()){
                    System.out.println("\nNão é possível deixar o campo de nome vazio!");
                }

                else{
                    break;
                }
            }
            
            System.out.print("Digite o saldo que deseja inserir: ");
            conta.saldo = sc.nextDouble();

             System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque."
            , conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);
            sc.close(); //Fecha o Scanner.
        
        }
        catch(InputMismatchException e){
            System.out.print("\nO tipo de dado não é válido...\n\n");
            sc.nextLine(); //Necessário para limpar o buffer que guardar o valor preenchido errado.
        }
    }
}