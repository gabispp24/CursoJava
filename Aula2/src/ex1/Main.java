package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<Carro>();
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Avião");
            System.out.println("3 - Cadastrar Bicicleta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Carro c = new Carro();
                    System.out.print("Marca: ");
                    c.setMarca(sc.next());
                    System.out.print("Modelo: ");
                    c.setModelo(sc.next());
                    System.out.print("Cor: ");
                    c.setCor(sc.next());
                    System.out.print("Placa: ");
                    c.setPlaca(sc.next());
                    System.out.print("Portas: ");
                    c.setPortas(sc.nextInt());
                    carros.add(c);
                    break;

                case 2:
                    for (Bicicleta bicicleta : bicicletas) {
                        Bicicleta b = new Bicicleta();
                        System.out.println("Marca: " + b.getMarca());
                        System.out.println("Modelo: " + b.getModelo());
                        System.out.println("Cor: " + b.getCor());
                        b.ligar();
                        b.acelerar();

                        bicicletas.add(b);
                        break;
                    }


                case 3:
                    for (Aviao aviao : avioes) {
                        Aviao a = new Aviao();
                        System.out.println("Marca: " + a.getMarca());
                        System.out.println("Modelo: " + a.getModelo());
                        System.out.println("Cor: " + a.getCor());
                        a.ligar();
                        a.acelerar();
                    }
                    break;

                case 0:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }


        }while (opcao != 0);
        sc.close();
    }
}
