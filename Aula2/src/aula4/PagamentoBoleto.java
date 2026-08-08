package aula4;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    private String dataVencimento;

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
