public abstract class Empresa extends Usuario {
    protected String cnpj;
    protected String razaoSocial;

    //get e set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirPerfil() {

    }

    @Override
    public void atualizarDados() {

    }

    public abstract void exibirInformacoes();

}
