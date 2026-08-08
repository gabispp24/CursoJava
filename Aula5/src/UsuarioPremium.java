import java.util.Date;

public abstract class UsuarioPremium extends UsuarioComum implements Monetizavel{
    private Date dataInicialPremium;
    private Date dataFimPremium;

    public UsuarioPremium(String name, String email, String senha, long id, Date dataCadastro, Date dataInicialPremium, Date dataFimPremium) {
        super(name, email, senha, id, dataCadastro);
        this.dataInicialPremium = dataInicialPremium;
        this.dataFimPremium = dataFimPremium;
    }

    //get e set
    public Date getDataInicialPremium() {
        return dataInicialPremium;
    }

    public void setDataInicialPremium(Date dataInicialPremium) {
        this.dataInicialPremium = dataInicialPremium;
    }

    public Date getDataFimPremium() {
        return dataFimPremium;
    }

    public void setDataFimPremium(Date dataFimPremium) {
        this.dataFimPremium = dataFimPremium;
    }

    //override
    @Override
    public void visualizarContaudos(){

    }

    @Override
    public void ativarMonetizacao() {

    }

    @Override
    public void desativarMonetizacao() {

    }

    public abstract void ativarPremium();
    public abstract void cancelarPremium();

}
