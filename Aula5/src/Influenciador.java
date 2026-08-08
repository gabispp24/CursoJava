public class Influenciador extends CriadorConteudo implements Patrocinado {
    private String nicho;

    public Influenciador(String name, String email, String senha, long id, String descricao, int seguidores, String nicho) {
        super(name, email, senha, id, descricao, seguidores);
        this.nicho = nicho;
    }

    //get e set
    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    //override
    @Override
    public void criarConteudo() {

    }

    @Override
    public void gerenciarConteudo() {

    }

    @Override
    public void receberPatrocinio() {

    }

    @Override
    public void encerrarPatrocinio() {

    }

    public void fazerParceria() {

    }

}
