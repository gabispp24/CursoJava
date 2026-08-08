package aula4;

public class PagamentoCartao extends Pagamento{
    private int numeroDoCartao;
    private int parcelas;

    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(int numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void processarPagamento() {

    }

    @Override
    public void emitirComprovante() {

    }
}
