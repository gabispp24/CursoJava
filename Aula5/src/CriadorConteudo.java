public abstract class CriadorConteudo extends Usuario implements Transmitivel{
    private String descricao;
    private int seguidores;

    public CriadorConteudo(String name, String email, String senha, long id, String descricao, int seguidores) {
        super(name, email, senha, id);
        this.descricao = descricao;
        this.seguidores = seguidores;
    }

    //get e set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    //override
    @Override
    public void exibirPerfil() {

    }

    @Override
    public void atualizarDados() {

    }

    @Override
    public void iniciarLive() {

    }

    @Override
    public void encerrarLive() {

    }

    public abstract void criarConteudo();
    public abstract void gerenciarConteudo();

}
