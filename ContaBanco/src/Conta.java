/**
*   <p>A classe Conta é a responsável pela criação do 
*   objeto conta, que contém todos os dados do titular.</p>
*
*   @author Patrick Rocha
*   @version 1.0
*   @since 03/12/2025
*
*   @param numero número da conta    
*   @param agencia agência da conta
*   @param nomeCliente nome do titular da conta
*   @param saldo saldo da conta
 */

public class Conta{
    
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public Conta(){

    } 

    public Conta(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
}
