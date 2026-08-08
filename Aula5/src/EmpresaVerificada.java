import java.util.Date;

public class EmpresaVerificada extends Empresa{
    private Date dataVerificacao;

    //get e set
    public Date getDataVerificacao() {
        return dataVerificacao;
    }

    public void setDataVerificacao(Date dataVerificacao) {
        this.dataVerificacao = dataVerificacao;
    }

    //override
    @Override
    public void exibirInformacoes() {

    }

    public void selarVerificacao(){

    }
}
