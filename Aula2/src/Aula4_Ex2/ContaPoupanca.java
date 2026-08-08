package Aula4_Ex2;

public class ContaPoupanca extends Conta implements Rendimentavel{

    private double taxaDeRendimento;
    private int diaRendimento;

    //get e set
    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    // overrride
    @Override
    public double depositar() {
        return 0;
    }

    @Override
    public double sacar() {
        return 0;
    }

    @Override
    public void consultarValor() {

    }

    @Override
    public void calcularRendimento() {

    }

    @Override
    public void aplicarRendimento() {

    }
}
