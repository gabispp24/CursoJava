package Aula4_Ex2;

public class ContaCorrente extends Conta {

    private double limite;
    private double taxaManutencao;

    // get e set
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    // override
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
}
