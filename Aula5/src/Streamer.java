public class Streamer extends CriadorConteudo implements Patrocinado {
    private String plataforma;

    public Streamer(String name, String email, String senha, long id, String descricao, int seguidores, String plataforma) {
        super(name, email, senha, id, descricao, seguidores);
        this.plataforma = plataforma;
    }

    //get e set
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public void iniciarLive() {

    }

    public void encerrarLive() {

    }
}
