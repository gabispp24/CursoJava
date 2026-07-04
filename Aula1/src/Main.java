//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua nome: ");
        String nome = teclado.nextLine ();

        System.out.println("Digite seu rg: ");
        String rg = teclado.next();

        System.out.println("Digite seu cpf: ");
        String cpf = teclado.next();

        System.out.println("Digite seu telefone: ");
        String tel = teclado.next();

        System.out.println("Digite seu endereço: ");
        String end = teclado.next();

        System.out.println("digite seu email: ");
        String email = teclado.next();


        System.out.printf("Nome: %s rg %s cpf %s telefone %s endereço %s email ", nome, rg, cpf, tel, end, email);
    }


}