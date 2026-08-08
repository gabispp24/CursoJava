package Aula4_Ex2;

public class ContaInvestimento extends Conta implements Rendimentavel{

    private String tipoInvestimento;
    private double rentabilidadeAnual;

    //get e set
    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getRentabilidadeAnual() {
        return rentabilidadeAnual;
    }

    public void setRentabilidadeAnual(double rentabilidadeAnual) {
        this.rentabilidadeAnual = rentabilidadeAnual;
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
