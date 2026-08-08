import java.util.Date;

public abstract class UsuarioComum extends Usuario{
    protected Date dataCadastro;

    public UsuarioComum(String name, String email, String senha, long id, Date dataCadastro) {
        super(name, email, senha, id);
        this.dataCadastro = dataCadastro;
    }

    //get e set
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    //override
    @Override
    public void exibirPerfil() {

    }

    @Override
    public void atualizarDados() {

    }

    public abstract void visualizarContaudos();

}
