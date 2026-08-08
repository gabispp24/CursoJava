package q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("nome do produto: ");
        p.setNome(sc.next());

        System.out.println("quantidade");
        p.setQuantidade(sc.nextInt());

        System.out.println("preco unitario: ");
        p.setPrecoUnitario(sc.nextDouble());

        double total = p.calcularSubtotal();
        System.out.printf("\nValor da compra: R$ %.2f%n", total );

        double desconto;
        double totalGeral;
        if (total > 500) {
            desconto = p.getTotal() * 0.15;
            totalGeral = p.getTotal() - desconto;
        } else {
            desconto = 0;
            totalGeral = total;
        }
        System.out.printf("\nValor da compra: R$ %.2f%n", p.getTotal());
        System.out.printf("desconto: R$ %.2f%n", desconto);
        System.out.printf("total a pagar: R$ %.2f%n", totalGeral);

        System.out.println("\nValor pago: R$ ");
        double valorPago = sc.nextDouble();

        if (valorPago > totalGeral) {
            System.out.printf("troco: R$ %.2f%n", valorPago - totalGeral);
        } else if (valorPago < totalGeral) {
            System.out.printf("falta pagar: R$ %.2f%n", totalGeral - valorPago );
        } else if ( valorPago == totalGeral) {
            System.out.println("nao tem desconto");
        }
        else {
            System.out.println("pagamento realizado");
            sc.close();
        }

    }
}
