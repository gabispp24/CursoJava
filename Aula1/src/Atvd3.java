import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atvd3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println(" ==== MENU =====");
            System.out.println(" 1 - cadastrar produto");
            System.out.println(" 2 - listar");
            System.out.println(" 3 - editar produto");
            System.out.println(" 4 - excluir produto");
            System.out.println(" 5 - sair");
            System.out.println("digite a opçao que deseja: ");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    // cadastrar
                    Produto p = new Produto();
                    sc.nextLine();

                    System.out.println("nome: ");
                    p.nome = sc.nextLine();

                    System.out.println("preço: ");
                    p.valor = sc.nextDouble();

                    System.out.println("quantidade: ");
                    p.quant = sc.nextInt();
                    produtos.add(p);
                    break;

                case 2:
                    //listar
                   for (int i = 0; i < produtos.size();  i++)
                       System.out.println(i + " - " + produtos.get(i).nome);
                    break;

                case 3:
                    // editar
                    System.out.println("Digite o numero do produto que deseja editar: ");
                    int indice = sc.nextInt();

                    sc.nextLine();

                    System.out.println("nome nome: ");
                    produtos.get(indice).nome = sc.nextLine();

                    System.out.println("ediatar preço: ");
                    produtos.get(indice).valor = sc.nextDouble();

                    System.out.println("editar quantidade: ");
                    produtos.get(indice).quant = sc.nextInt();

                    System.out.println("Porduto aualizado" );

                    break;

                case 4:
                    // excluir
                    System.out.println("digite o numero do produto que deseja excluir: ");
                    int indeceExcluir = sc.nextInt();

                    produtos.remove(indeceExcluir);

                    System.out.println("produto excluido");

                    break;

                case 5:
                    System.out.println("sistema encerrado");
                    break;

                default:
                    System.out.println("opcao não encontrada");

            }

        } while (opcao != 5);

        sc.close();
    }
}
