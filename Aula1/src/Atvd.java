import java.util.Scanner;

public class Atvd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("digite outro numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("o maior numero é: " + num1);
        } else if (num2 > num1)
        System.out.println(" o maior numero é: " + num2);
        else {
            System.out.println("os dois sao iguais");

        }
    }
}


