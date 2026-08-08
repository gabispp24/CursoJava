package ex1;

public class Carro extends Veiculo implements Motorizado{
    private String placa;
    private int portas;
    private int id;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }


    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto.");
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" +
                "placa='" + placa + '\'' +
                ", portas=" + portas +
                '}';

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void ligar() {
        System.out.println("o carro esta ligado");
    }

    @Override
    public void desligar() {
        System.out.println("o carro esta desligado");
    }

    @Override
    public void acelerar() {
        System.out.println("o carro esta acelerando á 120km/h");
    }

    @Override
    public void frear() {
        System.out.println("o carro esta freiando");
    }
}
