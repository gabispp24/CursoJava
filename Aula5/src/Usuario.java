public abstract class Usuario {
    protected String name;
    protected String email;
    protected String senha;
    protected long id;

    public Usuario(String name, String email, String senha, long id) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    //get e set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract void exibirPerfil();
    public abstract void atualizarDados();

}
