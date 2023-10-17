package aplicacao;

import model.entidades.Conta;
import model.excecoes.ExcecoesDeDominio;

import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntre com os dados da conta\n");
        System.out.print("Número da conta: ");
        Integer numero = sc.nextInt();
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        sc.next();
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numero, titular, saldoInicial, limiteSaque);

        System.out.print("Informe uma quantia para sacar: ");
        double saque = sc.nextDouble();

        try {
            conta.saque(saque);
            System.out.printf("Saldo atualizado: %.2f%n", conta.getSaldo());
        } catch (ExcecoesDeDominio e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
