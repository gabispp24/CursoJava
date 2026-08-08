package aula4;

public class PagamentoPix extends Pagamento{
    private String chavePix;
    private String banco;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
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
