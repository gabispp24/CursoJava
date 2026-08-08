package aula4;

public abstract class Pagamento {
    protected double valor;
    protected String data;
    protected String status;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract double calcularTaxa();

    public abstract void processarPagamento();

    public abstract void emitirComprovante();
}
