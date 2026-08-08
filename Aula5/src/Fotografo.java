public class Fotografo extends CriadorConteudo {
    private String especialidade;

    public Fotografo(String name, String email, String senha, long id, String descricao, int seguidores, String especialidade) {
        super(name, email, senha, id, descricao, seguidores);
        this.especialidade = especialidade;
    }

    //get e set
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //override
    @Override
    public void criarConteudo() {

    }

    @Override
    public void gerenciarConteudo() {

    }

    public void publicarFotos(){

    }
}
