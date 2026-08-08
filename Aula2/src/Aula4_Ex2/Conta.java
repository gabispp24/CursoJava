package Aula4_Ex2;

public abstract class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double consutarSaldo(){
        return saldo;
    }

    public abstract double depositar();

    public abstract double sacar();

    public abstract void consultarValor();

}

