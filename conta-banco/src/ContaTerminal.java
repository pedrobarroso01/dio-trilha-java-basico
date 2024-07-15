import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo!!");
        System.out.println();

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        Integer numero = Integer.parseInt(entrada.nextLine());

        System.out.println("Por favor, digite o saldo de sua conta: ");
        Float saldo = Float.parseFloat(entrada.nextLine());



        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente,agencia,numero,saldo);

    }
}
