import java.util.Date;

public class EmpresaVerificada extends Empresa{
    private Date dataVerificacao;

    public EmpresaVerificada(String name, String email, String senha, long id, String cnpj, String razaoSocial, Date dataVerificacao) {
        super(name, email, senha, id, cnpj, razaoSocial);
        this.dataVerificacao = dataVerificacao;
    }

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
