package Aula4_Ex2;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("digite o saldo");
        double saldo = sc.nextDouble();

        System.out.println("\nEscolha o tipo de conta");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Investimento");

        int opcao = sc.nextInt();

        Conta conta;

        switch (opcao){
            case 1:
                conta = new
                ContaCorrente();
        }
    }
}
